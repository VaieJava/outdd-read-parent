package com.outdd.dao;

import com.outdd.api.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vaie
 * @Created 2019/1/26 17:37
 */
@Mapper
public interface MemberDao {
    int deleteByPrimaryKey(String userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(String userId);

    UserEntity selectByPrimaryName(String userName);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}
