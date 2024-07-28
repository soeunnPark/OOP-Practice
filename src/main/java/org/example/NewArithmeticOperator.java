package org.example;

public interface NewArithmeticOperator {
    public boolean supports(String operator);
    int calculate(int operand1, int operand2);
}
