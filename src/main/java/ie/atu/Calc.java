package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[]arg){
        add();

    }

    public static void add() {
        System.out.println("please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

}

