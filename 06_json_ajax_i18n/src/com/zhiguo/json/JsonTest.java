package com.zhiguo.json;/*
@date 2021/5/28 - 9:17 下午
*/

import com.google.gson.Gson;
import com.zhiguo.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {


    //javaBean和json的互转
    @Test
    public void test1(){

        Person person = new Person(1,"志国好帅");

        //创建Gson对象实例
        Gson gson = new Gson();

        //toJson是把Java对象转换回json字符串
        String personJsonString = gson.toJson(person);

        System.out.println(personJsonString);

        //fromJson是把json字符串转换回Java对象
        //第一个参数是json字符串
        //第二个参数是转换回去的Java对象类型
        Person person1 = gson.fromJson(personJsonString, Person.class);

        System.out.println(person1);

    }


    @Test
    //list和json的互转
    public void test2(){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1,"喜羊羊"));
        personList.add(new Person(2,"志国"));

        Gson gson = new Gson();

        //把List转换为json字符串
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);

        List<Person> list = gson.fromJson(personListJsonString, new PersonListType().getType());

        System.out.println(list);

        Person person = list.get(0);

        System.out.println(person);
    }


    @Test
    //map和json的互转
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<>();

        personMap.put(1,new Person(1,"志国好帅"));
        personMap.put(2,new Person(2,"喜羊羊好帅"));

        Gson gson = new Gson();

        //把Map集合转换成Json字符串

        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

        Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new PersonMapType().getType());

        System.out.println(personMap2);

        Person p = personMap2.get(1);

        System.out.println(p);


    }
}
