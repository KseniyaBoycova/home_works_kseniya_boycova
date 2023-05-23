package by.it.boycova.tests.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.additional.CalculatorWithMemory;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMemoryTest {
    @Test
    void saveLastResult() {

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());
        double expected=140.45999999999998;

        calculator.addition(4.1,105,31.359999999999996);
        calculator.saveLastResult();
        double actual= calculator.load();
        assertEquals(expected, actual);
    }

    @Test
    void checkLoad() {
        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());
        double expected=140.45999999999998;

        calculator.addition(4.1,105,31.359999999999996);
        calculator.saveLastResult();
        double actual= calculator.load();
        assertEquals(expected, actual);
    }

    @Test
    public void checkMult(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 105.0;
        double actual= calculator.multiplication(15,7);

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void checkDiv(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 5.6;
        double actual= calculator.division(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSub(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 23;
        double actual= calculator.subtraction(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkAdd(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 140.45999999999998;
        double actual= calculator.addition(4.1,105, 31.36);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkSquare(){


        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 31.359999999999996;
        double actual= calculator.squaring(5.6,2);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkModul(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 1;
        double actual= calculator.getModul(1 );
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkRoot(){

        CalculatorWithMemory calculator= new CalculatorWithMemory(new CalculatorWithMathCopy());

        double expected= 1;
        double actual= calculator.getSquareRoot( 1);
        Assertions.assertEquals(expected,actual);

    }

}