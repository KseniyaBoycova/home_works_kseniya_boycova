package by.it.boycova.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private  long counter;

    private CalculatorWithMathCopy calculator= new CalculatorWithMathCopy();

    private void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }


    public double addition(double x, double y, double a){
        incrementCountOperation();
        return calculator.addition(x, y, a);
    }

    public double subtraction(int x, int y){
        incrementCountOperation();
        return calculator.subtraction(x, y);
    }

    public double multiplication(int x, int y){
        incrementCountOperation();
        return calculator.multiplication(x, y);
    }

    public double division (double x, double y){
        incrementCountOperation();
        return calculator.division(x, y);
    }

    public double squaring (double x, int y){
        incrementCountOperation();
        return calculator.squaring(x, y);
    }

    public double getModul(double x){
        incrementCountOperation();
        return calculator.getModul(x);
    }

    public double getSquareRoot( double x){
        incrementCountOperation();
        return calculator.getSquareRoot(x);
    }
}
