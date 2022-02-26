package com.company;

public class Expression {


    public int evaluate() {
        return switch (operator) {
            case "+" -> numbers[0] + numbers[1];
            case "-" -> numbers[0] - numbers[1];
            case "*" -> numbers[0] * numbers[1];
            case "/" -> numbers[0] / numbers[1];
            default -> 0;
        };

    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    int[] numbers;
    String operator;


}
