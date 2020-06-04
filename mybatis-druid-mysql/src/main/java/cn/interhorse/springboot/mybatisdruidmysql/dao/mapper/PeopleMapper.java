package cn.interhorse.springboot.mybatisdruidmysql.dao.mapper;

import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
}
