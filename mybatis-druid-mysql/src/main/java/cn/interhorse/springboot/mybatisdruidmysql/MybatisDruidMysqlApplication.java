package cn.interhorse.springboot.mybatisdruidmysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.interhorse.springboot.mybatisdruidmysql.dao.mapper")
public class MybatisDruidMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDruidMysqlApplication.class, args);
    }

}
