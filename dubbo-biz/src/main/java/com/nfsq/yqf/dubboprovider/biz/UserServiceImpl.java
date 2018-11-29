package com.nfsq.yqf.dubboprovider.biz;

import Bean.User;
import Bean.YQFResult;
import api.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:14:32
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public YQFResult<User> selectUser(String userName) {
        log.info("开始调用dubbo服务提供者userName:"+userName);
        YQFResult<User> result = new YQFResult<>();
        User user = User.builder().userName(userName).age(18).build();
        result.setMessage("成功");
        result.setSuccess(true);
        result.setData(user);
        log.info("dubbo调用结束");
        return result;
    }
}
