package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain { ///140,46
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calculatorWithMathCopy.addition(4.1, calculatorWithMathCopy.multiplication(15, 7), calculatorWithMathCopy.squaring(calculatorWithMathCopy.division(28,5),2));
        System.out.println(result);
    }
}
