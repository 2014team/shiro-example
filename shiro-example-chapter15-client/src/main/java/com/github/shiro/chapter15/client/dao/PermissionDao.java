package com.github.shiro.chapter15.client.dao;

import com.github.shiro.chapter15.client.entity.Permission;

public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}
