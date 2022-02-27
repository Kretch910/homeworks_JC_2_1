package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Set<Integer> positiveNumberList = new TreeSet<>();

        for (int number : intList) {
            if (number > 0) {
                if (number % 2 == 0) {
                    positiveNumberList.add(number);
                }
            }
        }
        for(int number : positiveNumberList) {
            System.out.println(number);
        }


    }
}
