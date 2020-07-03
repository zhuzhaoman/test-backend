package com.example.test.service;

import com.example.test.mapper.UserMapper;
import com.example.test.pojo.User;
import com.example.test.pojo.UserBO;
import com.example.test.pojo.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhuzhaoman
 * @date 2020/7/2 0002 20:13
 * @description 描述
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> login(UserBO userBO) {
        String username = userBO.getUsername();
        String password = userBO.getPassword();

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);

        return userMapper.selectByExample(userExample);
    }
}
