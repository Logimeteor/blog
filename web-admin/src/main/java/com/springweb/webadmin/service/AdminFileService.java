package com.springweb.webadmin.service;

import org.springframework.web.multipart.MultipartFile;
import com.springweb.webcommon.utils.Response;


public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
