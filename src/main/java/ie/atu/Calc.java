package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[]arg){
        add();
        multiply();
        divide();
        subtract();
    }

    public static void add() {
        System.out.println("Add");
        System.out.println("please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

    public static void multiply(){
        System.out.println("\n\nMultiply");
        System.out.println("please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

    public static void divide(){
        System.out.println("\n\nDivide");
        System.out.println("please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }

    public static void subtract() {
        System.out.println("\n\nSubract");
        System.out.println("please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }
}

