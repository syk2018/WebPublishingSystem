package com.syk.publishing.mbg.mapper;

import com.syk.publishing.mbg.model.Sessions;
import com.syk.publishing.mbg.model.SessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionsMapper {
    long countByExample(SessionsExample example);

    int deleteByExample(SessionsExample example);

    int deleteByPrimaryKey(Long sessionId);

    int insert(Sessions record);

    int insertSelective(Sessions record);

    List<Sessions> selectByExample(SessionsExample example);

    Sessions selectByPrimaryKey(Long sessionId);

    int updateByExampleSelective(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByExample(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByPrimaryKeySelective(Sessions record);

    int updateByPrimaryKey(Sessions record);
}