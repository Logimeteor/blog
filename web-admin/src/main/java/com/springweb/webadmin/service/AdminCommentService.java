package com.springweb.webadmin.service;

import com.springweb.webadmin.model.vo.comment.DeleteCommentReqVO;
import com.springweb.webadmin.model.vo.comment.ExamineCommentReqVO;
import com.springweb.webadmin.model.vo.comment.FindCommentPageListReqVO;
import com.springweb.webcommon.utils.Response;


public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);

    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);

}
