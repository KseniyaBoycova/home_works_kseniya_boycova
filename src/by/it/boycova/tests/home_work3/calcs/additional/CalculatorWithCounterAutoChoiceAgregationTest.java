package by.it.boycova.tests.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoChoiceAgregationTest {

    @Test
    void checkGetCountOperation() {

        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        long expected;
        long actual;

        if (calculator1 !=null) {
            calculator1.incrementCountOperation();
            expected = calculator1.getCountOperation();

        }else if (calculator2 !=null){
            calculator2.incrementCountOperation();
            expected = calculator2.getCountOperation();

        }else{
            calculator3.incrementCountOperation();
            expected = calculator3.getCountOperation();

        }


        if (calculator1 !=null) {
             actual= calculator1.getCountOperation();
        }else if (calculator2 !=null){
             actual= calculator2.getCountOperation();
        }else{
             actual= calculator3.getCountOperation();
        }

        assertEquals(expected, actual);
    }

    @Test
    void checkAdd() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 140.45999999999998;

        double actual;

        if (calculator1 !=null){
             actual= calculator1.addition(4.1,105, 31.36);;
        }else if (calculator2 !=null){
             actual= calculator2.addition(4.1,105, 31.36);;
        }else{
             actual= calculator3.addition(4.1,105, 31.36);
        }


        Assertions.assertEquals(expected,actual);


    }

    @Test
    void checkSubtraction() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 23;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.subtraction(28,5);;
        }else if (calculator2 !=null){
            actual= calculator2.subtraction(28,5);;
        }else{
            actual= calculator3.subtraction(28,5);
        }


        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkMultiplication() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 105;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.multiplication(15,7);;
        }else if (calculator2 !=null){
            actual= calculator2.multiplication(15,7);;
        }else{
            actual= calculator3.multiplication(15,7);
        }


        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkDivision() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 5.6;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.division(28,5);;
        }else if (calculator2 !=null){
            actual= calculator2.division(28,5);;
        }else{
            actual= calculator3.division(28,5);
        }


        Assertions.assertEquals(expected,actual);

    }

    @Test
    void checkSquaring() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 31.359999999999996;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.squaring(5.6,2);;
        }else if (calculator2 !=null){
            actual= calculator2.squaring(5.6,2);;
        }else{
            actual= calculator3.squaring(5.6,2);
        }


        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getModul() {
        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 1;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.getModul(1);;
        }else if (calculator2 !=null){
            actual= calculator2.getModul(1);;
        }else{
            actual= calculator3.getModul(1);
        }


        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getSquareRoot() {

        CalculatorWithCounterAutoChoiceAgregation calculator1=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator() );
        CalculatorWithCounterAutoChoiceAgregation calculator2=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy() );
        CalculatorWithCounterAutoChoiceAgregation calculator3=
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends() );

        double expected= 1;

        double actual;

        if (calculator1 !=null){
            actual= calculator1.getSquareRoot(1);;
        }else if (calculator2 !=null){
            actual= calculator2.getSquareRoot(1);;
        }else{
            actual= calculator3.getSquareRoot(1);
        }


        Assertions.assertEquals(expected,actual);
    }
}