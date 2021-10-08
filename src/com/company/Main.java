package com.company;



public class Main {

    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();
        double one;
        double two;
        int action ;

        do {
            System.out.print("Enter first number : ");
            one = readClass.readNextDouble();
            System.out.print("Enter second number : ");
            two = readClass.readNextDouble();

            Calculator calculator = new Calculator(one, two);

            System.out.println("Choose an action : ");
            System.out.println("1. Add");
            System.out.println("2. Subs");
            System.out.println("3. Multi");
            System.out.println("4. Div");
            System.out.println("0. Exit");
            System.out.print("Enter number of action : ");

            action = (int) readClass.readNextDouble();

            switch (action) {
                case 1:
                    System.out.printf("%.3f%n", calculator.add());
                    break;
                case 2:
                    System.out.printf("%.3f%n", calculator.subs());
                    break;
                case 3:
                    System.out.printf("%.3f%n", calculator.multi());
                    break;
                case 4:
                    System.out.printf("%.3f%n", calculator.div());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered something other ");

            }
        }while (action != 0);

    }
}
