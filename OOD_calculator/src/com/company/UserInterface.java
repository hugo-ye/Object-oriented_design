package com.company;

import java.util.Scanner;

public class UserInterface implements AutoCloseable {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public Expression readExpression() {
        Expression givenExpression = new Expression();
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("Give expression in the form x () y");
                String[] array = scanner.nextLine().split(" ");
                int[] numbers = {Integer.parseInt(array[0]), Integer.parseInt(array[2])};
                givenExpression.setNumbers(numbers);
                givenExpression.setOperator(array[1]);
                loop = false;



            } catch (Exception e) {
                System.out.println("Invalid Expression");
            }

        }
        return givenExpression;
    }

    public void showValue(int value) {
        System.out.printf("The value is %d\n", value);
    }
}
