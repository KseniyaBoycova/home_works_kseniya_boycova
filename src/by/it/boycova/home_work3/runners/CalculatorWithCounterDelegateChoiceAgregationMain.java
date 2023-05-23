package by.it.boycova.home_work3.runners;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterAutoAgregation;
import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {

    public static void main(String[] args) {


        CalculatorWithCounterAutoChoiceAgregation calculator1= new
                CalculatorWithCounterAutoChoiceAgregation (new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculator2= new
                CalculatorWithCounterAutoChoiceAgregation (new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculator3= new
                CalculatorWithCounterAutoChoiceAgregation (new CalculatorWithMathExtends());

        double resultMulti= calculator1.multiplication(15,7);
        double resultDiv= calculator1.division(28,5);
        double resultSquare= calculator1.squaring(calculator1.division(28,5),2);
        double resultCommonSum= calculator1.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
        System.out.println(calculator1.getCountOperation());

         resultMulti= calculator2.multiplication(15,7);
         resultDiv= calculator2.division(28,5);
         resultSquare= calculator2.squaring(calculator2.division(28,5),2);
         resultCommonSum= calculator2.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
        System.out.println(calculator2.getCountOperation());

         resultMulti= calculator3.multiplication(15,7);
         resultDiv= calculator3.division(28,5);
         resultSquare= calculator3.squaring(calculator3.division(28,5),2);
         resultCommonSum= calculator3.addition(4.1,resultMulti,resultSquare);

        System.out.println(resultCommonSum);
        System.out.println(calculator3.getCountOperation());
    }
}
