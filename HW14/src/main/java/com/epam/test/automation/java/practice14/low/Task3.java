package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    private Task3() {
    }

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream().filter(x->x!=null&&x.length()>0).map(x-> String.valueOf(x.charAt(0)) + x.charAt(x.length() - 1)).collect(Collectors.toList());
    }
}
