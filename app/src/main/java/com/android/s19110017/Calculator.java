package com.android.s19110017;

public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public double mod(double num1, double num2) {
        return num1 % num2;
    }

    public double squareRoot(double num1, double num2) {
        return (num1 * Math.sqrt(num2));
    }

    public double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double log(double num1) {
        return Math.log(num1);
    }

    public double factorial(double num1) {
        if (num1 <= 2) return num1;
        return num1 * factorial(num1 - 1);
    }

    public double negate(double num1) {
        if (num1 == Double.MAX_VALUE || num1 == Double.MIN_VALUE)
            throw new ArithmeticException("Tràn bộ nhớ !!");
        return -num1;
    }
}
