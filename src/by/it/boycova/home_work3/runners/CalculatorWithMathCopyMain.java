package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain { ///140,46
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double resultMulti= calculator.multiplication(15,7);
        double resultDiv= calculator.division(28,5);
        double resultSquare= calculator.squaring(calculator.division(28,5),2);
        double resultCommonSum= calculator.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
    }
}
