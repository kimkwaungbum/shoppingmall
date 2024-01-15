package com.weavus.weavusshoppingmall.controller;

import com.weavus.weavusshoppingmall.entity.User;
import com.weavus.weavusshoppingmall.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserMapper userMapper;

    @GetMapping("/login")
    public String login(){

        User user = userMapper.findById("1");
        System.out.println(user);
        return "login";
    }
}
