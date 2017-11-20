package com.github.shiro.chapter15.client.service;

import com.github.shiro.chapter15.client.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}