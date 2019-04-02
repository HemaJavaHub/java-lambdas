package com.example;

public class MethodToLambda {

    // Convert the following methods to lambdas:

    public int addTwo(int a) {
        int result = a + 2;
        return result;
    }

    public double divideByTwo(double x) {
        double result = x / 2;
        return result;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int addTwo(int a, int b) {
        int result = a + b;
        return result;
    }

    public void printTwoMessages(String message1, String message2) {
        System.out.println(message1);
        System.out.println(message2);
    }

    public int returnTwo() {
        int result = 2;
        return result;
    }

}
