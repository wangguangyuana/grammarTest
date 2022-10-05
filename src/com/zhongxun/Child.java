package com.zhongxun;

/**
 * @author:12285
 * @className:Child
 * @data:2022/9/28 10:00
 * @dascription:
 * @version:0.1
 * @since:jdk1.8
 */
public class Child extends Parent {
    private String hobby;

    public Child(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Child() {
    }

    @Override
    public String toString() {
        return  super.toString()+"Child{" +
                "hobby='" + hobby + '\'' +
                '}';
    }
}
