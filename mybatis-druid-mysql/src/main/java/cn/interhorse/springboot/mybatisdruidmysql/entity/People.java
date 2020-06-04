package cn.interhorse.springboot.mybatisdruidmysql.entity;

/**
 * @author Yuzhe Ma
 * @date 2020/6/4
 */
public class People {
    private int id;
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public People(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
