package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double resultMulti= calculator.multiplication(15,7);
        calculator.incrementCountOperation();
        double resultDiv= calculator.division(28,5);
        calculator.incrementCountOperation();
        double resultSquare= calculator.squaring(calculator.division(28,5),2);
        calculator.incrementCountOperation();
        double resultCommonSum= calculator.addition(4.1,resultMulti,resultSquare);
        calculator.incrementCountOperation();

        System.out.println(resultCommonSum);
        System.out.println(calculator.getCountOperation());

    }
}
