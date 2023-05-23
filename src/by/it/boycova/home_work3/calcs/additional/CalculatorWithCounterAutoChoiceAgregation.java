package by.it.boycova.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private long counter;

    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {

        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {

        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {

        this.calculator3 = calculator;
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }


    public double addition(double x, double y, double a){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.addition(x, y, a);
        }else if (calculator2 !=null){
            return calculator2.addition(x, y, a);
        }
        return calculator3.addition(x, y, a);
    }

    public double subtraction(int x, int y){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.subtraction(x, y);
        }else if (calculator2 !=null){
            return calculator2.subtraction(x, y);
        }
        return calculator3.subtraction(x, y);
    }

    public double multiplication(int x, int y){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.multiplication(x, y);
        }else if (calculator2 !=null){
            return calculator2.multiplication(x, y);
        }
        return calculator3.multiplication(x, y);
    }

    public double division (double x, double y){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.division(x, y);
        }else if (calculator2 !=null){
            return calculator2.division(x, y);
        }
        return calculator3.division(x, y);
    }

    public double squaring (double x, int y){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.squaring(x, y);
        }else if (calculator2 !=null){
            return calculator2.squaring(x, y);
        }
        return calculator3.squaring(x, y);
    }

    public double getModul(double x){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.getModul(x);
        }else if (calculator2 !=null){
            return calculator2.getModul(x);
        }
        return calculator3.getModul(x);
    }

    public double getSquareRoot( double x){
        incrementCountOperation();
        if (calculator1 !=null){
            return calculator1.getSquareRoot(x);
        }else if (calculator2 !=null){
            return calculator2.getSquareRoot(x);
        }
        return calculator3.getSquareRoot(x);
    }

}
