package by.it.boycova.tests.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterClassic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterClassicTest {

    @Test
    void checkIncrementCountOperation() {

    }

    @Test
    void checkGetCountOperation() {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        long expected = calculator.getCountOperation()+1;
        calculator.incrementCountOperation();
        long actual= calculator.getCountOperation();
        assertEquals(expected, actual);

    }

    @Test
    public void checkMult(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 105.0;
        double actual= calculator.multiplication(15,7);

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void checkDiv(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 5.6;
        double actual= calculator.division(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSub(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 23;
        double actual= calculator.subtraction(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkAdd(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 140.45999999999998;
        double actual= calculator.addition(4.1,105, 31.36);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkSquare(){


        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 31.359999999999996;
        double actual= calculator.squaring(5.6,2);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkModul(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 1;
        double actual= calculator.getModul(1 );
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkRoot(){

        CalculatorWithCounterClassic calculator= new CalculatorWithCounterClassic();

        double expected= 1;
        double actual= calculator.getSquareRoot( 1);
        Assertions.assertEquals(expected,actual);

    }
}