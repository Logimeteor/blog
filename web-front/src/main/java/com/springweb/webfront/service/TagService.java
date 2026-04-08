package com.springweb.webfront.service;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.tag.FindTagArticlePageListReqVO;
import com.springweb.webfront.vo.tag.FindTagListReqVO;


public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList(FindTagListReqVO findTagListReqVO);

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
