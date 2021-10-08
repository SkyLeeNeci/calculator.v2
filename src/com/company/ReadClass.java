package com.company;

import java.util.Scanner;

public class ReadClass {

    public double readNextDouble(){

        Scanner scanner = new Scanner(System.in);
        double i = 0;
        if(scanner.hasNextDouble()){
            i = scanner.nextDouble();
        }else {
            System.out.println("You entered not an integer");
        }
        return i;
    }
}
