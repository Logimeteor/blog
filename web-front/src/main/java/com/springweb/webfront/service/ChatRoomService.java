package com.springweb.webfront.service;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListReqVO;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListRspVO;


public interface ChatRoomService {

    /**
     * 获取历史消息
     * @param findChatMessagePageListReqVO
     * @return
     */
    Response<FindChatMessagePageListRspVO> findHistoryMessages(FindChatMessagePageListReqVO findChatMessagePageListReqVO);
}
