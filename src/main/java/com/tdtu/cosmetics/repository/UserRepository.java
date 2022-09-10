package com.tdtu.cosmetics.repository;

import com.tdtu.cosmetics.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

@Mapper
public interface UserRepository {
    @Select("SELECT * FROM users WHERE id = #{id}")
    Users getById(@Param("id")BigDecimal id);
}