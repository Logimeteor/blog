package com.springweb.webfront.vo.chatroom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindChatMessagePageListReqVO {

    /**
     * 游标 ID
     */
    private Long lastId;

}
