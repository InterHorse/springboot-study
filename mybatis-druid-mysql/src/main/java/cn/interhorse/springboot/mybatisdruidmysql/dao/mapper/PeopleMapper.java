package cn.interhorse.springboot.mybatisdruidmysql.dao.mapper;

import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yuzhe Ma
 * @date 2020/6/4
 */
@Mapper
@Repository
public interface PeopleMapper {
    @Select("select * from people")
    List<People> selectAll();

    @Select("select * from people where id = #{id}")
    People selectById(@Param("id") int id);

    @Insert("insert into people(name, age) values(#{name}, #{age})")
    int insert(People people);

    @Update("update people set name = #{name}, age = #{age} where id = #{id}")
    int updateById(People people);

    @Delete("delete from people where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
