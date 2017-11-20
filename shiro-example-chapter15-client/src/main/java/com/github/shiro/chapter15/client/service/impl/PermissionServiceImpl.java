package com.github.shiro.chapter15.client.service.impl;

import com.github.shiro.chapter15.client.dao.PermissionDao;
import com.github.shiro.chapter15.client.entity.Permission;
import com.github.shiro.chapter15.client.service.PermissionService;

public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao;

    public void setPermissionDao(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }

}
