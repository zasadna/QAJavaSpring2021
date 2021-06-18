package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    private Task7() {
    }

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return integerList.stream().filter(l-> (integerList.stream().filter(x->x!=null && (x % 2) == 0).anyMatch(t-> t.equals(l)) && !integerList.subList(number, integerList.size()).contains(l)) || (integerList.stream().filter(x->x!=null && (x % 2) == 0).noneMatch(t-> t.equals(l)) && integerList.subList(number, integerList.size()).contains(l))).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}