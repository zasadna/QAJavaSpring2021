package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    private Task6() {
    }

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {
       return numbers.stream().map(n->stringList.stream().filter(x->x!=null&& x.length()==n && Character.isDigit(x.charAt(0))).sorted().findFirst().orElse("Not Found")).collect(Collectors.toList());
    }
}
