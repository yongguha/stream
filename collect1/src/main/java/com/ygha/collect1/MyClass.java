package com.ygha.collect1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyClass {

    /*
    public Student(String name, int engScore, int mathScore, int sex, int age) {
        this.name = name;
        this.engScore = engScore;
        this.mathScore = mathScore;
        this.sex = sex;
        this.age = age;
    }
     */

    public static int MALE = 0;
    public static int FEMALE = 1;

    public static void main(String[] args){

        List<Student> totalList = Arrays.asList(

                new Student("Hong Kil Dong", 60, 70, MALE, 44),
                new Student("Kim Eun Hee", 45, 90, FEMALE, 34),
                new Student("Kang Hun Hee", 90, 56, FEMALE, 54),
                new Student("Kim Dae Gak", 90, 89, MALE, 24),
                new Student("Lee Seung Chul", 70, 10, MALE, 19)
        );


        List<Student> maleList = totalList.stream().filter(s->s.getSex()==MALE).collect(Collectors.toList());
        maleList.stream().forEach(s->System.out.println(s.getName()));
        System.out.println();

        HashSet<Student> femaleList = totalList.stream()
                .filter(s->s.getSex()==FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleList.stream().forEach(s->System.out.println(s.getName()));

        Map<String, Integer> feMap = femaleList.stream()
                .collect(Collectors.toMap(
                        s->s.getName(),
                        s->s.getEngScore()
                ));

        int value = feMap.get("Kim Eun Hee");
        System.out.println("Kim Eun Hee's english score" + value);




    }


}