package com.syk.publishing.mbg.mapper;

import com.syk.publishing.mbg.model.Comments;
import com.syk.publishing.mbg.model.CommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsMapper {
    long countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Long commentid);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExampleWithBLOBs(CommentsExample example);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Long commentid);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKeyWithBLOBs(Comments record);

    int updateByPrimaryKey(Comments record);
}