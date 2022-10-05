package com.zhongxun;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.util.Pair;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Collectors;

public class AliStandTest {
    @Test
    public void Test1() {
        /*String str = "a,b,c,,";
        String[] ary = str.split(",");
        // 预期大于 3，结果是 3
        System.out.println(ary.length);
        System.out.println("yyyy-MM-dd HH:mm:ss");
        System.out.println(System.currentTimeMillis());
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println(stringList.isEmpty());*/
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 6.19));
        pairArrayList.add(new Pair<>("version", 10.24));
        pairArrayList.add(new Pair<>("version", 13.14));
        Map<String, Double> map = pairArrayList.stream().collect(
                // 生成的 map 集合中只有一个键值对：{version=13.14}
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v1));
        System.out.println(map);
        Set<String> stringSet = map.keySet();
        stringSet.forEach(System.out::println);

    Integer[] integers = new Integer[10];
    }
    @Test
    public void toArrayTest(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer[] integers = integerList.toArray(new Integer[0]);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
    public static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    @Test
    public void simpleDateFormatTest(){

    }
    @Test
    public void unpackingTest(){
        Integer i = 10;
        //自动拆箱，调用intValue方法
        int j = i;
        int intValue = i.intValue();


    }

    @Test
    public void genericityTest (){
        List<Integer> integerList = new ArrayList<>();
       /* List<String>[] li2 = new ArrayList<Integer>[];
        ArrayList<String>[] l = new ArrayList[];*/
        List<String> l = new ArrayList<>();
    }

    @Test
    public void localDateTimeTest (){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);  //2022-09-30T17:23:32.119
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //格式化
        String str = dtf.format(dt);
        System.out.println(str);   //2022-09-30 17:23:32

        LocalDateTime localDateTime = LocalDateTime.parse(str,dtf);  //解析
        System.out.println(localDateTime); //2022-09-30T17:33:23
    }
}
