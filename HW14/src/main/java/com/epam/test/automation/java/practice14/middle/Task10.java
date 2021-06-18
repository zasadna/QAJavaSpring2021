package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    private Task10() {
    }

    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream().sorted(Comparator.comparing(String::length).reversed()).map(x->x.toUpperCase().charAt(x.length()-1)).collect(Collectors.toList());
    }
}