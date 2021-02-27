package com.ygha.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyClass {
    public static void main(String[] args){

        List<Student> studentList = Arrays.asList(
          new Student("Hong Kil Dong", 80),
                new Student("Kim Chul Soo", 70),
                new Student("Kang Hun Hee", 50)
        );


        System.out.println("[student name]");
        Stream<Student> nameStudent=studentList.stream();
        nameStudent.forEach(s->System.out.println(s.getName()));

        System.out.println("[student score]");
        Stream<Student> scoredStudent = studentList.stream();
        scoredStudent.forEach(s->System.out.println(s.getScore()));

        }




}

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}