package com.springweb.webadmin.service;


import com.springweb.webadmin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.springweb.webcommon.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
