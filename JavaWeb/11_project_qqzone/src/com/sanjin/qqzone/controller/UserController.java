package com.sanjin.qqzone.controller;

import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.pojo.UserBasic;
import com.sanjin.qqzone.service.TopicService;
import com.sanjin.qqzone.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/6 下午11:48
 * @description
 */
public class UserController {

    private UserBasicService userService = null;
    private TopicService topicService = null;

    public String index(){
        return "login";
    }

    public String login(String loginId, String pwd, HttpSession session){
        UserBasic userBasic = userService.login(loginId, pwd);
        List<UserBasic> friendList = userService.getFriendList(userBasic);
        List<Topic> topicList = topicService.getTopicList(userBasic);
        if (userBasic != null){
            System.out.println("登陆成功--------");
            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);
            session.setAttribute("userBasic", userBasic);
            session.setAttribute("friend", userBasic);
            return "index";
        } else {
            System.out.println("登陆失败--------");
            return "login";
        }

    }

    public String friend(Integer id, HttpSession session){
        UserBasic friend = userService.getUserBasicById(id);
        List<Topic> topicList = topicService.getTopicList(friend);
        friend.setTopicList(topicList);
        session.setAttribute("friend", friend);
        return "index";
    }
}
