package com.java24hours;

import java.util.*;

class DiceKostkaDoGry {
    public static void main(String[] arguments) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Liczba losowa po rzucie kostką wynosi "
            + value);
    }
}
