package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {


        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calculatorWithMathExtends.addition(4.1, calculatorWithMathExtends.multiplication(15, 7), calculatorWithMathExtends.squaring(calculatorWithMathExtends.division(28, 5), 2));
        System.out.println(result);
    }
}
