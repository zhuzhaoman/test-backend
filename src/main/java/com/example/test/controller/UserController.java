package com.example.test.controller;

import com.example.test.pojo.User;
import com.example.test.pojo.UserBO;
import com.example.test.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhuzhaoman
 * @date 2020/7/2 0002 19:17
 * @description 描述
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody UserBO userBO) {

        Map<String, Object> result = new HashMap<>();

        List<User> userList = userService.login(userBO);

        if (userList.size() > 0) {
            result.put("code", 200);
            result.put("data", userList.get(0));
            result.put("msg", "登录成功");
        } else {
            result.put("code", 500);
            result.put("data", null);
            result.put("msg", "登录失败");
        }

        return result;
    }
}
