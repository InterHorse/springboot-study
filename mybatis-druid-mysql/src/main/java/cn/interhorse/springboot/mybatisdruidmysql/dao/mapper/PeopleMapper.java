package cn.interhorse.springboot.mybatisdruidmysql.dao.mapper;

import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author InterHorse
 * @date 2020-06-04
 */
public interface PeopleMapper {
    /**
     * 查询全部数据
     *
     * @return
     */
    @Select("select * from people")
    List<People> selectAll();

    /**
     * 根据 id 查询
     *
     * @param id
     * @return
     */
    @Select("select * from people where id = #{id}")
    People selectById(@Param("id") int id);

    /**
     * 插入数据
     *
     * @param people
     * @return
     */
    @Insert("insert into people(name, age) values(#{name}, #{age})")
    int insert(People people);

    /**
     * 更新数据
     *
     * @param people
     * @return
     */
    @Update("update people set name = #{name}, age = #{age} where id = #{id}")
    int updateById(People people);

    /**
     * 根据 id 删除
     *
     * @param id
     * @return
     */
    @Delete("delete from people where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
