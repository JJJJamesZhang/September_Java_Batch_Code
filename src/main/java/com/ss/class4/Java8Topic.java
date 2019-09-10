package com.ss.class4;

import java.util.*;
//default and static function
interface Demo{
    public default void newMethod(){
        System.out.println("this is default method");
    }

    public static void newMethod1(){
        System.out.println("this is static method 1");
    }

    public static  void newMethod2(){
        System.out.println("this is static method 2");
    }
}

public class Java8Topic implements Demo{
    @Override
    public void newMethod() {
        System.out.println("this is default method");
    }

    //junit test
    public double demo(){
        return 0.9;
    }

    //functionalInterface
    //new Runnable
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //travel list
        list.forEach(e->{
            System.out.println(e);
        });

        list.stream().filter(e -> e> 2).forEach(e -> {
            System.out.println(e);
        });

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4, "zhaoliu");

        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){
            System.out.println(map.get(key));
        }

        map.forEach((k,v) -> {
            System.out.println("key: "+k + "value: " +v);
        });
    }

}
