package com.syk.publishing.mbg.mapper;

import com.syk.publishing.mbg.model.Following;
import com.syk.publishing.mbg.model.FollowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowingMapper {
    long countByExample(FollowingExample example);

    int deleteByExample(FollowingExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("followingUserId") Long followingUserId);

    int insert(Following record);

    int insertSelective(Following record);

    List<Following> selectByExample(FollowingExample example);

    int updateByExampleSelective(@Param("record") Following record, @Param("example") FollowingExample example);

    int updateByExample(@Param("record") Following record, @Param("example") FollowingExample example);
}