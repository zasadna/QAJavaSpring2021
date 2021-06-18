package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {
    private Task9() {
    }

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {
        return stringList.stream().collect(Collectors.toMap( x -> String.valueOf(x.charAt(0)), String::length, Integer::sum)).entrySet().stream().sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey)).map(x->x.getValue()+"-"+x.getKey()).collect(Collectors.toList());
    }
}
