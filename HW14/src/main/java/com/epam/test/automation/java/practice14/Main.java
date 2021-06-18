package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task1
        /*char symbol = 'a';
        @NotNull
        List<String> stringList = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
        List<String> stringListResult = Task1.filterByFirstAndLastCharacter(symbol, stringList); //{"asda", "asdfa"}
        System.out.println(stringListResult);*/

        //Task2
       /* List<String> stringList = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
        List<Integer> stringListResult = Task2.sortAscLengthsOfStrings(stringList);
        System.out.println(stringListResult);*/

        //Task3
        /*List<String> list = Arrays.asList("asd", "a", "basdw");
        List<String> t=Task3.getListExtremeLetters(list);
        System.out.println(t);*/

        //Task4
        int number = 2;
        List<String> list = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
        Task4.filterAndSortByLastDigit(number, list);
        //{"A1", "S3"}

        //Task5
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> listRes = Task5.getSortedAscOddValues(list5);
        //{"1", "3", "5"}
    }
}
