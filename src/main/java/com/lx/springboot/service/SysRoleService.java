package com.lx.springboot.service;

import com.lx.springboot.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> getSysRolesByUserId(Integer id);
}
