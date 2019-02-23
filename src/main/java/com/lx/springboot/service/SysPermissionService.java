package com.lx.springboot.service;

import com.lx.springboot.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
public interface SysPermissionService extends IService<SysPermission> {

    List<SysPermission> getSysPermissionByUserId(Integer id);
}
