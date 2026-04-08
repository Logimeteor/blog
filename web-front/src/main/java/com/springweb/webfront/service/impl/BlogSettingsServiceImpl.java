package com.springweb.webfront.service.impl;

import com.springweb.webcommon.domain.dos.BlogSettingsDO;
import com.springweb.webcommon.domain.mapper.BlogSettingsMapper;
import com.springweb.webfront.convert.BlogSettingsConvert;
import com.springweb.webfront.service.BlogSettingsService;
import com.springweb.webfront.vo.blogsettings.FindBlogSettingsDetailRspVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springweb.webcommon.utils.Response;


@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
