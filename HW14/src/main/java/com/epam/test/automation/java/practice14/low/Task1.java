package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    private Task1() {
    }

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream().filter(x-> x.indexOf(symbol)!= x.lastIndexOf(symbol)).collect(Collectors.toList());
    }
}
