package com.ygha.flatmap;

import java.util.Arrays;
import java.util.List;

public class MyClass {

    public static void main(String[] args){
        List<String> inputList = Arrays.asList("java8 lambda", "stream mapping");

        inputList.stream()
                .flatMap(data->Arrays.stream(data.split(" ")))
                .forEach(word->System.out.println(word));

        System.out.println();
    }

}