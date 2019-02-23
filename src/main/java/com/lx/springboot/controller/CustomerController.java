package com.lx.springboot.controller;


import com.lx.springboot.entity.Customer;
import com.lx.springboot.service.CustomerService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/get/{id}")
    public Customer get(@PathVariable("id")Integer id){
        Customer customer = customerService.getById(id);
        return customer;
    }

    @GetMapping("/list")
    @RequiresPermissions("customer:list")
    public String list(Model model){
        List<Customer> customers = customerService.getAll();
        model.addAttribute("customers", customers);
        return "customer";
    }
}
