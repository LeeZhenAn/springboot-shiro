package com.lx.springboot.mapper;

import com.lx.springboot.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
    List<Customer> getAll();
}
