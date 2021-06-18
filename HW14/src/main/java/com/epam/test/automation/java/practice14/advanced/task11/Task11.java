package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    private Task11() {
    }

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList.stream().collect(Collectors.toMap(Entrant::getYearOfEntering, x -> String.valueOf(x.getSchoolNumber()), (x, y) -> x.equals(y)?x: x+","+y)).entrySet().stream().map(x->new YearSchoolStat(x.getKey(), x.getValue().split(",").length)).sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering)).collect(Collectors.toList());
    }
}
