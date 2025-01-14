package com.ssm.service;

import com.ssm.bean.User;

public interface UserService {
    /**
     * 根据Id获取用户信息
     * @param id
     * @return
     */
    User getById(Long id);
}
