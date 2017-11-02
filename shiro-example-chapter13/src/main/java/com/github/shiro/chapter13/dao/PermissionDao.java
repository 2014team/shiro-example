package com.github.shiro.chapter13.dao;

import com.github.shiro.chapter13.entity.Permission;


public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}