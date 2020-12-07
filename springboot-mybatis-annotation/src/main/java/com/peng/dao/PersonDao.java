package com.peng.dao;

import com.peng.domain.Person;
import org.apache.ibatis.annotations.Select;

/**
 * mapper注解去掉，直接在入口类挂@MapperScan注解，可以扫描dao下所有的注解
 */

import java.util.List;

//@Mapper
public interface PersonDao {

    @Select("select * from person")
    public List<Person> selectAll();
}
