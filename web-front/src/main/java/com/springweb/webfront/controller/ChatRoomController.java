package com.springweb.webfront.controller;

import com.springweb.webcommon.aspect.ApiOperationLog;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.service.ChatRoomService;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListReqVO;
import com.springweb.webfront.vo.chatroom.FindChatMessagePageListRspVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/chat")
@Api(tags = "聊天室")
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    @PostMapping("/message/history")
    @ApiOperation(value = "获取历史消息")
    @ApiOperationLog(description = "获取历史消息")
    public Response<FindChatMessagePageListRspVO> findHistoryMessages(@RequestBody @Validated FindChatMessagePageListReqVO findChatMessagePageListReqVO) {
        return chatRoomService.findHistoryMessages(findChatMessagePageListReqVO);
    }

}
