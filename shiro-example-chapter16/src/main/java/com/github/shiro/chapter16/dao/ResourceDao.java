package com.github.shiro.chapter16.dao;

import java.util.List;

import com.github.shiro.chapter16.entity.Resource;

public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

}
