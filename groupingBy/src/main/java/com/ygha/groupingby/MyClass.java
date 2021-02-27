package com.ygha.groupingby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args){

        List<Student> totalList = Arrays.asList(
                new Student("Hong Kil Dong", 10, Student.Sex.MALE, Student.City.Seoul),
                new Student("Kim Su Ae", 6, Student.Sex.FEMALE, Student.City.Pusan),
                new Student("Shin Yong Gwon", 10, Student.Sex.MALE, Student.City.Pusan),
                new Student("Park Su Mi", 6, Student.Sex.FEMALE, Student.City.Seoul)
        );

        System.out.println("===========================================================================");
        Map<Student.Sex, List<Student>> mapBySex =
        totalList.stream().collect(Collectors.groupingBy(Student::getSex));

        System.out.println("Male Student Name is");
        mapBySex.get(Student.Sex.MALE).stream()
                .forEach(s->System.out.println(s.getName()+""));


        System.out.println("===========================================================================");

        Map<Student.City, List<String>> mapByCity =
        totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        )
                );

        System.out.println("[Pusan]");
        mapByCity.get(Student.City.Pusan).stream()
                .forEach(s->System.out.println(s+""));

        System.out.println("===========================================================================");

        Map<String, List<Student.Sex>> map =
                totalList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getName,
                                        Collectors.mapping(Student::getSex, Collectors.toList())
                                )
                        );

        System.out.println("[FEMALE]");
        map.get("Hong Kil Dong").stream()
                .forEach(s->System.out.println(s+""));


        System.out.println("===========================================================================");

        HashMap<Student.City, List<String>> mapByCustom =
                totalList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Student::getCity,
                                        HashMap::new,
                                        Collectors.mapping(Student::getName, Collectors.toList())
                                )
                        );

        System.out.println("[Seoul]");
        mapByCity.get(Student.City.Seoul).stream()
                .forEach(s->System.out.println(s+""));

    }
}