package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Long id) {
        User user = userDao.selectById(1L);
        return user;
    }
}
