package com.lx.springboot.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author lza
 * @since 2019-02-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 父级权限id
     */
    private Integer parentId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限字符串，如employees:create,employees:update,employees:delete
     */
    private String permission;

    /**
     * 权限类型：0-目录；1-菜单；2-按钮
     */
    private String type;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 状态：0-不可用；1-可用
     */
    private String status;


}
