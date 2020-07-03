package cn.interhorse.springboot.lombok.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author InterHorse
 * @date 2020-07-03
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Person1 {
    private int id;
    private String name;
    private int age;
}
