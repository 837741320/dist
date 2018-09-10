package com.qfedu.mapper;

import com.qfedu.pojo.Categroy;

public interface CategroyMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Categroy record);

    int insertSelective(Categroy record);

    Categroy selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Categroy record);

    int updateByPrimaryKey(Categroy record);
}