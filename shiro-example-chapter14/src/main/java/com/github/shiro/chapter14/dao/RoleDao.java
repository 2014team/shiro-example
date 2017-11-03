package com.github.shiro.chapter14.dao;

import com.github.shiro.chapter14.entity.Role;
public interface RoleDao {

    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);

}

