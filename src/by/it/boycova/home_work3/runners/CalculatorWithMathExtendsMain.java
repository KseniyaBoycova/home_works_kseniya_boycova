package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double resultMulti= calculator.multiplication(15,7);
        double resultDiv= calculator.division(28,5);
        double resultSquare= calculator.squaring(calculator.division(28,5),2);
        double resultCommonSum= calculator.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
    }
}
