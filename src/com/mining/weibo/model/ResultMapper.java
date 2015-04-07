package com.mining.weibo.model;

import com.mining.weibo.model.Result;
import com.mining.weibo.model.ResultExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultMapper {
	int countByExample(ResultExample example);

	int deleteByExample(ResultExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Result record);

	int insertSelective(Result record);

	List<Result> selectByExample(ResultExample example);

	Result selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Result record,
			@Param("example") ResultExample example);

	int updateByExample(@Param("record") Result record,
			@Param("example") ResultExample example);

	int updateByPrimaryKeySelective(Result record);

	int updateByPrimaryKey(Result record);
}