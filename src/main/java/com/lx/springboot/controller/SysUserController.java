package com.lx.springboot.controller;


import com.lx.springboot.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
@Controller
public class SysUserController {

    @RequestMapping({"", "/user/login"})
    public String login(){
        return "login";
    }

    @PostMapping("/user/doLogin")
    public String doLogin(SysUser user, HttpSession session){
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        SecurityUtils.getSubject().login(token);
        SysUser loginUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        session.setAttribute("loginUser", loginUser);
        return "redirect:/index";
    }

    @GetMapping("/user/logout")
    public String logout(){
        //退出
        SecurityUtils.getSubject().logout();
        return "redirect:/";
    }

}
