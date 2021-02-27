package com.ygha.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

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


        int sumi1 = studentList.stream()
                .mapToInt(Student::getMathScore)
                .sum();

        Optional<Integer> sum2 = studentList.stream()
                .map(Student::getMathScore)
                .reduce((a,b)->a+b);

        int temp = sum2.get();


        Optional<Integer> sum3 = studentList.stream()
                .map(Student::getEngScore)
                .reduce( (a,b)->a+b);





    }
}