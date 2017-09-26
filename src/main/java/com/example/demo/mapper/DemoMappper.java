package com.example.demo.mapper;

import com.example.demo.Demo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMappper {

    @Select("select * from user where user = #{name}")
    public List<Demo> likeName(String name);


//    @Select("select * from user where id = #{id}")
//    public Demo getById(long id);
//
//
//    @Select("select name from user where id = #{id}")
//    public String getNameById(long id);


}
