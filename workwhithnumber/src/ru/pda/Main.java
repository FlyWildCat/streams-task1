package ru.pda;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumber = new ArrayList<>();

        for (Integer integer : intList) {
            if (integer > 0 && integer % 2 == 0) {
                positiveNumber.add(integer);
            }
        }
        positiveNumber.sort(Comparator.naturalOrder());
        for (Integer pNumber : positiveNumber) {
            System.out.println(pNumber);
        }
    }
}
