package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calCounter= new CalculatorWithCounterClassic();

        //  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calCounter.addition(4.1, calCounter.multiplication(15, 7), calCounter.squaring(calCounter.division(28,5),2));
        System.out.println(result);
        System.out.println(calCounter.getCountOperation());

    }
}
