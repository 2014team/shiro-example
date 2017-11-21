package com.github.shiro.chapter16.dao;

import java.util.List;

import com.github.shiro.chapter16.entity.Role;

public interface RoleDao {

    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}
