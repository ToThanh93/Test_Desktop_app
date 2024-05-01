package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        scanner.close();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 != 0 ? num1 / num2 : 0;
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f", num1, operator, num2, result);
    }
}