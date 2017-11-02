package com.github.shori.chapter12.dao;

import com.github.shori.chapter12.entity.Permission;

public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}