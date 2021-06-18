package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    private Task5() {
    }

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream().filter(x->x!=null&&(x % 2) != 0).sorted().map(String::valueOf)
                .collect(Collectors.toList());
    }
}
