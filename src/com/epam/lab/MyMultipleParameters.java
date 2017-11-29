package com.epam.lab;

public class MyMultipleParameters {
    public int myMethod(String a, int... args) {
        int sum = 0;
        for (int item : args) {
            sum += item;

        }
        return sum;
    }

    public String myMethod(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : args) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
}
