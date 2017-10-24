package com.github.shori.service.impl;

import com.github.shori.dao.PermissionDao;
import com.github.shori.dao.impl.PermissionDaoImpl;
import com.github.shori.entity.Permission;
import com.github.shori.service.PermissionService;

public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
