package com.github.shori.chapter12.service.impl;

import com.github.shori.chapter12.dao.PermissionDao;
import com.github.shori.chapter12.entity.Permission;
import com.github.shori.chapter12.service.PermissionService;

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
