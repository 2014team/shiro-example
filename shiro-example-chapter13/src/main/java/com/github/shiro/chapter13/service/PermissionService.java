package com.github.shiro.chapter13.service;

import com.github.shiro.chapter13.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
