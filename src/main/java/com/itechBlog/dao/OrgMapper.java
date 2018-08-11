package com.itechBlog.dao;

import com.itechBlog.domain.OrgDO;

public interface OrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrgDO record);

    int insertSelective(OrgDO record);

    OrgDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrgDO record);

    int updateByPrimaryKey(OrgDO record);
}