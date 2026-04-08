package com.springweb.webfront.service;

import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.wiki.FindWikiArticlePreNextReqVO;
import com.springweb.webfront.vo.wiki.FindWikiCatalogListReqVO;

public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);

}
