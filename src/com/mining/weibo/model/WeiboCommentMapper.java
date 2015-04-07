package com.mining.weibo.model;

import com.mining.weibo.model.WeiboComment;
import com.mining.weibo.model.WeiboCommentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WeiboCommentMapper {
	int countByExample(WeiboCommentExample example);

	int deleteByExample(WeiboCommentExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(WeiboComment record);

	int insertSelective(WeiboComment record);

	List<WeiboComment> selectByExample(WeiboCommentExample example);

	WeiboComment selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") WeiboComment record,
			@Param("example") WeiboCommentExample example);

	int updateByExample(@Param("record") WeiboComment record,
			@Param("example") WeiboCommentExample example);

	int updateByPrimaryKeySelective(WeiboComment record);

	int updateByPrimaryKey(WeiboComment record);
}