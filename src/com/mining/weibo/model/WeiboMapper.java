package com.mining.weibo.model;

import com.mining.weibo.model.Weibo;
import com.mining.weibo.model.WeiboExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WeiboMapper {
	int countByExample(WeiboExample example);

	int deleteByExample(WeiboExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Weibo record);

	int insertSelective(Weibo record);

	List<Weibo> selectByExample(WeiboExample example);

	Weibo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Weibo record,
			@Param("example") WeiboExample example);

	int updateByExample(@Param("record") Weibo record,
			@Param("example") WeiboExample example);

	int updateByPrimaryKeySelective(Weibo record);

	int updateByPrimaryKey(Weibo record);
}