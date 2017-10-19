package com.github.shori.service;

import com.github.shori.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
