package by.it.boycova.tests.home_work3.calcs.simple;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {


    @Test
    public void checkMult(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 105.0;
        double actual= calculator.multiplication(15,7);

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void checkDiv(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 5.6;
        double actual= calculator.division(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSub(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 23;
        double actual= calculator.subtraction(28,5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkAdd(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 140.45999999999998;
        double actual= calculator.addition(4.1,105, 31.36);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkSquare(){


        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 31.359999999999996;
        double actual= calculator.squaring(5.6,2);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkModul(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 1;
        double actual= calculator.getModul(1 );
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkRoot(){

        CalculatorWithOperator calculator= new CalculatorWithOperator();

        double expected= 1;
        double actual= calculator.getSquareRoot( 1);
        Assertions.assertEquals(expected,actual);

    }
}
