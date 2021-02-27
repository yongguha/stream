package com.ygha.map;

import java.beans.FeatureDescriptor;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public static int MALE = 0;
    public static int FEMALE = 1;

    public static void main(String[] args){

        List<Student> studentList = Arrays.asList(
                new Student("Hong Kil dong", 90,80, MALE, 20),
                new Student("Kim Eun Hee", 50,80, FEMALE, 19),
                new Student("Kang Hun Hee", 70,65, FEMALE, 18),
                new Student("Kim Dae Kak", 70,82,MALE, 22)
        );


        studentList.stream()
                .map(s->s.getName())
                .forEach(s->System.out.println(s));

        studentList.stream()
                .map(s->s.getEngScore())
                .forEach(s->System.out.println(s));

        double ageAvg = studentList.stream()
                .filter(s->s.getSex()==FEMALE)
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();

        System.out.println("age average is :" + ageAvg);

        double engScoreAvg = studentList.stream()
                .filter(s->s.getSex()== FEMALE)
                .mapToInt(s->s.getEngScore())
                .average()
                .getAsDouble();

        System.out.println("female's engscore average is :" + engScoreAvg);



        int femaleEngScoreSum = studentList.stream()
                .filter(s->s.getSex()==FEMALE)
                .mapToInt(s->s.getEngScore())
                .reduce((x,y)->x+y)
                .getAsInt();

        System.out.println("female's engscore sum is :" + femaleEngScoreSum);





    }
}