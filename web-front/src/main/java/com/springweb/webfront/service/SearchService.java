package com.springweb.webfront.service;
import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.search.SearchArticlePageListReqVO;


public interface SearchService {

    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
