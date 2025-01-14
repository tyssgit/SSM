package com.ssm.handler;

import com.ssm.bean.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User detail(@PathVariable("id")Long id){
        User user = userService.getById(id);
        return user;
    }
}
