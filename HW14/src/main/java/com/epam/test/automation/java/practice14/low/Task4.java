package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    private Task4() {
    }

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream().filter(x->x!=null&&x.length()==number&&Character.isDigit(x.charAt(x.length()-1))).sorted().collect(Collectors.toList());
    }
}