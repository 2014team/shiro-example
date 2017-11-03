package com.github.shiro.chapter14.service.impl;

import com.github.shiro.chapter14.dao.PermissionDao;
import com.github.shiro.chapter14.entity.Permission;
import com.github.shiro.chapter14.service.PermissionService;

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
