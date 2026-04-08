package com.springweb.webfront.service;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.comment.FindCommentListReqVO;
import com.springweb.webfront.vo.comment.FindQQUserInfoReqVO;
import com.springweb.webfront.vo.comment.PublishCommentReqVO;


public interface CommentService {

    /**
     * 根据 QQ 号获取用户信息
     * @param findQQUserInfoReqVO
     * @return
     */
    Response findQQUserInfo(FindQQUserInfoReqVO findQQUserInfoReqVO);

    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response publishComment(PublishCommentReqVO publishCommentReqVO);

    /**
     * 查询页面所有评论
     * @param findCommentListReqVO
     * @return
     */
    Response findCommentList(FindCommentListReqVO findCommentListReqVO);
}
