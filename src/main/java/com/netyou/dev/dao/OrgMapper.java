package com.netyou.dev.dao;

import com.netyou.dev.domain.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}