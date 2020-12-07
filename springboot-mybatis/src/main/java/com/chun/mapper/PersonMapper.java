package com.chun.mapper;

import com.chun.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

     List<Person> selectAll();

}
