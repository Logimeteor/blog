package com.springweb.webadmin.service;


import com.springweb.webadmin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.springweb.webcommon.utils.Response;

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}
