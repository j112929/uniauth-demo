package com.shenma.xxx.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shenma.xxx.model.Module;

/**
 * 模块Mapper
 * @author stevin
 *
 */
@Repository
public interface ModuleMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(String id);
    
    List<Module> findAll(Module module);
    
    Module select(Module module);

    int updateByPrimaryKeySelective(Module module);

    int updateByPrimaryKey(Module record);
}