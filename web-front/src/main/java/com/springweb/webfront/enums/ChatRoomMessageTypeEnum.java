package com.springweb.webfront.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ChatRoomMessageTypeEnum {

    SYSTEM(0, "系统消息"),
    CHAT(1, "聊天消息"),
    ONLINE_USERS(2, "在线用户列表消息");

    private Integer code;
    private String description;

}
