package com.springweb.webadmin.controller;

import com.springweb.webadmin.model.vo.comment.DeleteCommentReqVO;
import com.springweb.webadmin.model.vo.comment.ExamineCommentReqVO;
import com.springweb.webadmin.model.vo.comment.FindCommentPageListReqVO;
import com.springweb.webadmin.service.AdminCommentService;
import com.springweb.webcommon.aspect.ApiOperationLog;
import com.springweb.webcommon.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/comment")
@Api(tags = "Admin 评论模块")
public class AdminCommentController {

    @Autowired
    private AdminCommentService commentService;

    @PostMapping("/list")
    @ApiOperation(value = "查询评论分页数据")
    @ApiOperationLog(description = "查询评论分页数据")
    public Response findCommentPageList(@RequestBody @Validated FindCommentPageListReqVO findCommentPageListReqVO) {
        return commentService.findCommentPageList(findCommentPageListReqVO);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "评论删除")
    @ApiOperationLog(description = "评论删除")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response deleteComment(@RequestBody @Validated DeleteCommentReqVO deleteCommentReqVO) {
        return commentService.deleteComment(deleteCommentReqVO);
    }

    @PostMapping("/examine")
    @ApiOperation(value = "评论审核")
    @ApiOperationLog(description = "评论审核")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response examinePass(@RequestBody @Validated ExamineCommentReqVO examineCommentReqVO) {
        return commentService.examine(examineCommentReqVO);
    }

}
