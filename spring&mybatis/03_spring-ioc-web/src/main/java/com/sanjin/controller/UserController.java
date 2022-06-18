package com.sanjin.controller;

import com.alibaba.fastjson.JSON;
import com.sanjin.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/16 下午6:23
 * @description
 */
@Controller
public class UserController {

    @RequestMapping("/filter")
    public ModelAndView fil(){
        System.out.println("fil-----");
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("name","sanjin");
        return view;
    }

    @RequestMapping("/req6")
    @ResponseBody
    public void req6(@CookieValue(value = "JSESSIONID",required = false) String userAgent, HttpSession session){
        System.out.println(userAgent);
    }

    @RequestMapping("/req5")
    @ResponseBody
    public void req5(@RequestHeader("user-agent") String userAgent){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(userAgent);
    }



    @RequestMapping("/conventer")
    @ResponseBody
    public User conventer(Date date){
        System.out.println(date);
        User user = new User();
        user.setDate(date);
        user.setName("11");

        return user;
    }

    @GetMapping(value = "/user/{username}/{addr}")
    @ResponseBody
    public User restFul(@PathVariable(value = "username") String name, @PathVariable("addr") String addr){
        User user = new User();
        user.setName(name);
        user.setAddr(addr);
        return user;
    }



    @RequestMapping(value = "/req4")
    @ResponseBody
    public void req4(@RequestBody List<User> userList){
        userList.forEach(System.out::println);
    }

    @RequestMapping(value = "/req3")
    @ResponseBody
    public void req3(String[] strs){
        System.out.println("strs = " + Arrays.toString(strs));
    }

    @RequestMapping(value = "/req2")
    @ResponseBody
    public void req2(User user){
        System.out.println("user = " + user);
    }

    @RequestMapping(value = "/req1")
    @ResponseBody
    public void req(Integer age, String username){
        System.out.println("age = " + age);
        System.out.println("username = " + username);
    }

    @RequestMapping(value = "/quick4",params = {"username"})
    @ResponseBody
    public User save4(){
        User user = new User();
        user.setName("sanjin");
        user.setAddr("zzu1");
        return user;

    }

    @RequestMapping(value = "/quick3",params = {"username"})
    @ResponseBody
    public String save3(){
        User user = new User();
        user.setName("sanjin");
        user.setAddr("zzu");
        String s = JSON.toJSONString(user);
        return s;

    }

    @RequestMapping(value = "/quick2",params = {"username"})
    public ModelAndView save2(HttpServletRequest req, ModelAndView modelAndView){
        modelAndView.addObject("username", req.getCookies());
        System.out.println(req.getRequestURI());
        System.out.println();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick1",params = {"username"})
    public ModelAndView save1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "sanjin");
        modelAndView.setViewName("success");
        return modelAndView;
    }


    @RequestMapping(value = "/quick",params = {"username"})
    @ResponseBody
    public void save(){
        System.out.println("controller saving-----");
//        return "success";
    }
}
