package com.vue.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

	@Select("SELECT memo_description FROM tbl_memo WHERE seq = #{no}")
	String selectMemo(String no);
	
}