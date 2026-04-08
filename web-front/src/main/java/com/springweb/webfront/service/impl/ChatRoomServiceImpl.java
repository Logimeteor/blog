package com.springweb.webfront.service.impl;

import com.springweb.webcommon.domain.dos.ChatMessageDO;
import com.springweb.webcommon.domain.mapper.ChatMessageMapper;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.enums.ChatRoomMessageTypeEnum;
import com.springweb.webfront.service.ChatRoomService;
import com.springweb.webfront.vo.chatroom.ChatMessageVO;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListReqVO;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListRspVO;
import com.springweb.webfront.websocket.ChatWebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.springweb.webcommon.utils.Response;
import com.springweb.webcommon.utils.Response;

@Service
@Slf4j
public class ChatRoomServiceImpl implements ChatRoomService {

    @Autowired
    private ChatMessageMapper chatMessageMapper;

    /**
     * 获取历史消息
     *
     * @param findChatMessagePageListReqVO
     * @return
     */
    @Override
    public Response<FindChatMessagePageListRspVO> findHistoryMessages(FindChatMessagePageListReqVO findChatMessagePageListReqVO) {
        // 每页展示 10 条消息
        int pageSize = 3;
        // 游标消息 ID
        Long lastId = findChatMessagePageListReqVO.getLastId();

        // 查询指定页码记录
        List<ChatMessageDO> messages = Objects.isNull(lastId)
                ? chatMessageMapper.selectRecentMessages(pageSize) // 如果 lastId 为 null, 说明查询的是第一页消息
                : chatMessageMapper.selectMessagesBefore(lastId, pageSize); // 若 lastId 不为 null, 则执行分页查询

        // DO 实体类转 VO 实体类
        FindChatMessagePageListRspVO vo = null;

        if (!CollectionUtils.isEmpty(messages)) {
            // 倒序变正序
            Collections.reverse(messages);

            List<ChatMessageVO> voList = messages.stream().map(chatMessageDO -> ChatMessageVO.builder()
                        .id(chatMessageDO.getId())
                        .type(ChatRoomMessageTypeEnum.CHAT.getCode())
                        .nickname(chatMessageDO.getNickname())
                        .avatar(chatMessageDO.getAvatar())
                        .content(chatMessageDO.getContent())
                        .time(chatMessageDO.getCreateTime().format(ChatWebSocketServer.TIME_FORMATTER))
                        .build()
            ).collect(Collectors.toList());

            vo = FindChatMessagePageListRspVO.builder()
                    .messages(voList)
                    .hasMore(messages.size() >= pageSize) // 是否还有下一页
                    .build();
        }

        return Response.success(vo);
    }
}
