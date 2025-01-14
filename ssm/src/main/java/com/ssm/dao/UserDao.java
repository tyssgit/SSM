package com.ssm.dao;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where id=#{id}")
    User selectById(Long id);
}
