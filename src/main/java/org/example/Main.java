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

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            case "sqrt":
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.printf("Square root of %.2f is %.2f\n", num1, result);
                } else {
                    System.out.println("Error! Cannot take the square root of a negative number.");
                    return;
                }
                return;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Error! Operator is not correct.");
                return;
        }

        System.out.printf("Result: %.2f %s %.2f = %.2f\n", num1, operator, num2, result);
    }
}