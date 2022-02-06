package com.sanjin.qqzone.controller;

import com.sanjin.qqzone.pojo.UserBasic;
import com.sanjin.qqzone.service.UserBasicService;

/**
 * @author sanjin
 * @date 2022/2/6 下午11:48
 * @description
 */
public class UserController {

    private UserBasicService  userService = null;

    public String index(){
        return "login";
    }

    public String login(String loginId, String pwd){
        UserBasic userBasic = userService.login(loginId, pwd);
        if (userBasic != null){
            System.out.println("登陆成功--------");
            return "redirect:index.html";
        } else {
            System.out.println("登陆失败--------");
            return "login";
        }

    }
}
