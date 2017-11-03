package com.github.shiro.chapter14.service;

import com.github.shiro.chapter14.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}