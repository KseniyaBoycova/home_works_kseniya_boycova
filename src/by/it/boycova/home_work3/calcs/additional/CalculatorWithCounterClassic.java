package by.it.boycova.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter;

    public void incrementCountOperation() {
        counter++;
         ;
    }

    public long getCountOperation() {
        return counter;
    }

    @Override
    public double squaring(double x, int y) {
        return super.squaring(x, y);
    }

    @Override
    public double getModul(double x) {
        return super.getModul(x);
    }

    @Override
    public double getSquareRoot(double x) {
        return super.getSquareRoot(x);
    }

    @Override
    public double addition(double x, double y, double a) {
        return super.addition(x, y, a);
    }

    @Override
    public double subtraction(int x, int y) {
        return super.subtraction(x, y);
    }

    @Override
    public double multiplication(int x, int y) {
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        return super.division(x, y);
    }
}
