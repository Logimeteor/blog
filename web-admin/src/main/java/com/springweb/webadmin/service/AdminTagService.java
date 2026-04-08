package com.springweb.webadmin.service;
import com.springweb.webadmin.model.vo.tag.AddTagReqVO;
import com.springweb.webadmin.model.vo.tag.DeleteTagReqVO;
import com.springweb.webadmin.model.vo.tag.FindTagPageListReqVO;
import com.springweb.webadmin.model.vo.tag.SearchTagsReqVO;
import com.springweb.webcommon.utils.PageResponse;
import com.springweb.webcommon.utils.Response;



public interface AdminTagService {

    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
