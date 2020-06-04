package cn.interhorse.springboot.mybatisdruidmysql.dao.mapper;

import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Yuzhe Ma
 * @date 2020/6/4
 */
@Repository
public interface PeopleXmlMapper {
    People selectById(@Param("id") int id);

    int insert(People people);

    int updateById(People people);

    int deleteById(@Param("id") Integer id);
}
