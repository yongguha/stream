package com.ygha.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyClass {




    public static void main(String[] args){

        List<String> list = Arrays.asList("Hong Kil Dong", "Kim Chul Soo");
        Stream<String> stringStream = list.stream();

        stringStream.forEach(name->System.out.println(name));

    }

}