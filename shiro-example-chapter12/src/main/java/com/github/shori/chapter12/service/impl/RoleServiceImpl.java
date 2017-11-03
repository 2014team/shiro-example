package com.github.shori.chapter12.service.impl;

import com.github.shori.chapter12.dao.RoleDao;
import com.github.shori.chapter12.entity.Role;
import com.github.shori.chapter12.service.RoleService;

public class RoleServiceImpl implements RoleService {

	 private RoleDao roleDao;

	    public RoleDao getRoleDao() {
	        return roleDao;
	    }

	    public void setRoleDao(RoleDao roleDao) {
	        this.roleDao = roleDao;
	    }

	    public Role createRole(Role role) {
	        return roleDao.createRole(role);
	    }

	    public void deleteRole(Long roleId) {
	        roleDao.deleteRole(roleId);
	    }

	    /**
	     * 添加角色-权限之间关系
	     * @param roleId
	     * @param permissionIds
	     */
	    public void correlationPermissions(Long roleId, Long... permissionIds) {
	        roleDao.correlationPermissions(roleId, permissionIds);
	    }

	    /**
	     * 移除角色-权限之间关系
	     * @param roleId
	     * @param permissionIds
	     */
	    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
	        roleDao.uncorrelationPermissions(roleId, permissionIds);
	    }
}