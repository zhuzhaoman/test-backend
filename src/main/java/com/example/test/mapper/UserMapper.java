package com.example.test.mapper;

import com.example.test.pojo.User;
import com.example.test.pojo.UserExample;
import java.util.List;

public interface UserMapper {

    List<User> selectByExample(UserExample userExample);
}