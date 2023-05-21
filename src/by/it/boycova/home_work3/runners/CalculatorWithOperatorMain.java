package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calculator.addition(4.1, calculator.multiplication(15, 7), calculator.squaring(calculator.division(28, 5), 2));
        System.out.println(result);
        System.out.println(calculator.division(28,5));
        System.out.println(calculator.squaring(5.6,2));
        double f =5.6;
        System.out.println(f*f);
    }
}
