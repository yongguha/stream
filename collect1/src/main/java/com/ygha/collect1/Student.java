package com.ygha.collect1;

public class Student {

    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int engScore;
    private int mathScore;
    private int sex;
    private int age;

    public Student(String name, int engScore, int mathScore, int sex, int age) {
        this.name = name;
        this.engScore = engScore;
        this.mathScore = mathScore;
        this.sex = sex;
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
