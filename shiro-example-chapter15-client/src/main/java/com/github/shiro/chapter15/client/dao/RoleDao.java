package com.github.shiro.chapter15.client.dao;

import com.github.shiro.chapter15.client.entity.Role;
public interface RoleDao {

    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);

}

