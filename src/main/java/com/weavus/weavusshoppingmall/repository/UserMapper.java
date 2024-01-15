package com.weavus.weavusshoppingmall.repository;

import com.weavus.weavusshoppingmall.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findById(String id);

}
