package com.github.shiro.chapter14.dao;

import com.github.shiro.chapter14.entity.Permission;

public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}
