package com.nfsq.yqf.dubboconsumer.controller;

import Bean.User;
import Bean.YQFResult;
import api.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:14:46
 **/
@RestController
public class UserController {
    @Reference
    UserService userService;
    @RequestMapping("/consumer")
    public YQFResult<User> getUser(String userName){
        return userService.selectUser(userName);
    }
}
