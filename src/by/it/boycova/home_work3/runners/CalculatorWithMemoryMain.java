package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import by.it.boycova.home_work3.calcs.additional.CalculatorWithMemory;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {


        CalculatorWithMemory calculator=
                new CalculatorWithMemory(new CalculatorWithMathCopy());


        double resultMulti= calculator.multiplication(15,7);
        double resultDiv= calculator.division(28,5);

        double resultSquare= calculator.squaring(calculator.division(28,5),2);
        double resultCommonSum= calculator.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
        calculator.saveLastResult();
        System.out.println(calculator.load());








    }

}
