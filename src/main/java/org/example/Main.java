package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, ^, sqrt, %):");
        String operator = scanner.next();
        scanner.close();

        try {
            double result = calculate(num1, num2, operator);
            System.out.printf("Result: %.2f %s %.2f = %.2f\n", num1, operator, num2, result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Error! Division by zero.");
                }
                return num1 / num2;
            case "^":
                return Math.pow(num1, num2);
            case "sqrt":
                if (num1 < 0) {
                    throw new IllegalArgumentException("Error! Cannot take the square root of a negative number.");
                }
                return Math.sqrt(num1);
            case "%":
                return num1 % num2;
            default:
                throw new IllegalArgumentException("Error! Operator is not correct.");
        }
    }
}