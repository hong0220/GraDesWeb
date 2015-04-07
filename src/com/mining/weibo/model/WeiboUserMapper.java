package com.mining.weibo.model;

import com.mining.weibo.model.WeiboUser;
import com.mining.weibo.model.WeiboUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WeiboUserMapper {
	int countByExample(WeiboUserExample example);

	int deleteByExample(WeiboUserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(WeiboUser record);

	int insertSelective(WeiboUser record);

	List<WeiboUser> selectByExample(WeiboUserExample example);

	WeiboUser selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") WeiboUser record,
			@Param("example") WeiboUserExample example);

	int updateByExample(@Param("record") WeiboUser record,
			@Param("example") WeiboUserExample example);

	int updateByPrimaryKeySelective(WeiboUser record);

	int updateByPrimaryKey(WeiboUser record);
}