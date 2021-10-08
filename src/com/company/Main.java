package com.company;



public class Main {

    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();
        double one;
        double two;
        System.out.print("Enter first number : ");
        one = readClass.readNextDouble();
        System.out.print("Enter second number : ");
        two = readClass.readNextDouble();

        Calculator calculator = new Calculator(one, two);

    }
}
