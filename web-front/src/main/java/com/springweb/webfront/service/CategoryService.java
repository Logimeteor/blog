package com.springweb.webfront.service;

import com.springweb.webcommon.utils.Response;
import com.springweb.webfront.vo.category.FindCategoryArticlePageListReqVO;
import com.springweb.webfront.vo.category.FindCategoryListReqVO;
import com.springweb.webcommon.utils.Response;


public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
