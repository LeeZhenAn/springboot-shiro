package com.lx.springboot.service;

import com.lx.springboot.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
public interface CustomerService extends IService<Customer> {

    List<Customer> getAll();
}
