package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task12 {
    private Task12() {
    }

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        return integerList1.stream().map(x->integerList2.stream().filter(y->(Math.abs(x) % 10) == (Math.abs(y) % 10)).map(y-> new NumberPair(x,y)).findFirst().orElse(null)).filter(Objects::nonNull).sorted(Comparator.comparingInt(NumberPair::getValue1).thenComparing(NumberPair::getValue2)).collect(Collectors.toList());
    }
}
