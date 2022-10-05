package com.zhongxun;

/**
 * @author:12285
 * @className:SwitchString
 * @data:2022/9/28 11:23
 * @dascription:
 * @version:0.1
 * @since:jdk1.8
 */
public class SwitchString {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(String param) {
        switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
    }
}
