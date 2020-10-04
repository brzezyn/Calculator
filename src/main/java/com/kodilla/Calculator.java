package com.kodilla;

public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return a - b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int adding = calculator.addAToB(4, 6);
        int subtracting = calculator.subtractAFromB(9, 7);
        System.out.println(adding);
        System.out.println(subtracting);
    }
}
