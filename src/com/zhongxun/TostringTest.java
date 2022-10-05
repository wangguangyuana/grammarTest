package com.zhongxun;


public class TostringTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.setId(111);
        child.setName("wang");
        child.setHobby("sport");

        System.out.println(child);
    }
}
