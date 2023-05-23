package by.it.boycova.tests.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithCounterAutoSuper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoSuperTest {

    @Test
    void checkIncrementCountOperation() {

    }

    @Test
    void checkGetCountOperation() {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        long expected = calculator.getCountOperation()+1;
        calculator.incrementCountOperation();
        long actual= calculator.getCountOperation();
        assertEquals(expected, actual);

    }

    @Test
    public void checkMult(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 105.0;
        double actual= calculator.multiplication(15,7);

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void checkDiv(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 5.6;
        double actual= calculator.division(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSub(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 23;
        double actual= calculator.subtraction(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkAdd(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 140.45999999999998;
        double actual= calculator.addition(4.1,105, 31.36);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkSquare(){


        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 31.359999999999996;
        double actual= calculator.squaring(5.6,2);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkModul(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 1;
        double actual= calculator.getModul(1 );
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkRoot(){

        CalculatorWithCounterAutoSuper calculator= new CalculatorWithCounterAutoSuper();

        double expected= 1;
        double actual= calculator.getSquareRoot( 1);
        Assertions.assertEquals(expected,actual);

    }
}