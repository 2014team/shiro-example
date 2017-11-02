package com.github.shori.chapter12.service;

import com.github.shori.chapter12.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
