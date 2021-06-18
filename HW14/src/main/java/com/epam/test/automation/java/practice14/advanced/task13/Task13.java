package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    private Task13() {
    }

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {
       return yearList.stream().map(y->new YearSchoolStat(y, (int)nameList.stream().filter(x->x.getYearOfEntering() == y).map(Entrant::getSchoolNumber).distinct().count())).sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering)).collect(Collectors.toList());
    }
}