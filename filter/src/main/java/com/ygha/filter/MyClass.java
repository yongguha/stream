package com.ygha.filter;

import java.util.Arrays;
import java.util.List;

public class MyClass {

    public static void main(String[] args){
        List<String> name = Arrays.asList("michael", "madonna","madonna","steve");

        name.stream().distinct().forEach(s->System.out.println(s));

        System.out.println();

        name.stream().filter(m->m.startsWith(m)).forEach(s->System.out.println(s));


    }

}