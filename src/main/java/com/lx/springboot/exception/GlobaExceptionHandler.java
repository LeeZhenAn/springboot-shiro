package com.lx.springboot.exception;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * @ClassName GlobaExceptionHandler
 * @Description TODO
 * @Author LeeZhenAn
 * @Date 2019/2/21 18:01
 */
@ControllerAdvice
public class GlobaExceptionHandler {

    /**
     * 登入异常处理
     * @param e
     * @param model
     * @return
     */
    @ExceptionHandler(AuthenticationException.class)
    public String authenticationExceptionProcessing(AuthenticationException e, Model model){
        String msg = "";
        if (e instanceof UnknownAccountException){
            msg = "账号不存在";
        }else if (e instanceof DisabledAccountException){
            msg = "账号异常";
        }else if (e instanceof IncorrectCredentialsException){
            msg = "账号/密码错误";
        }else {
            msg = "系统发生异常";
        }
        model.addAttribute("errorMsg", msg);
        return "forward:/user/login";
    }

    @ExceptionHandler(UnauthorizedException.class)
    public String unauthorizedException(){
        return "error/unauthorizedException";
    }

}
