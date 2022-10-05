package com.zhongxun;

/**
 * @author:12285
 * @className:Parent
 * @data:2022/9/28 9:59
 * @dascription:
 * @version:0.1
 * @since:jdk1.8
 */
public class Parent {
    private String name;
    private Integer id;

    public Parent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

