package cn.interhorse.springboot.mybatisdruidmysql.dao.mapper;

import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.apache.ibatis.annotations.Param;

/**
 * @author InterHorse
 * @date 2020-06-04
 */
public interface PeopleXmlMapper {
    /**
     * 根据 id 查询
     *
     * @param id
     * @return
     */
    People selectById(@Param("id") int id);

    /**
     * 插入数据
     *
     * @param people
     * @return
     */
    int insert(People people);

    /**
     * 更新数据
     *
     * @param people
     * @return
     */
    int updateById(People people);

    /**
     * 根据 id 删除数据
     *
     * @param id
     * @return
     */
    int deleteById(@Param("id") Integer id);
}
