package by.it.boycova.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.simple.CalculatorWithMathExtends;
import by.it.boycova.home_work3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter;

    public  void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    @Override
    public double squaring(double x, int y) {
        incrementCountOperation();
        return super.squaring(x, y);
    }

    @Override
    public double getModul(double x) {
        incrementCountOperation();
        return super.getModul(x);
    }

    @Override
    public double getSquareRoot(double x) {
        incrementCountOperation();
        return super.getSquareRoot(x);
    }

    @Override
    public double addition(double x, double y, double a) {
        incrementCountOperation();
        return super.addition(x, y, a);
    }

    @Override
    public double subtraction(int x, int y) {
        incrementCountOperation();
        return super.subtraction(x, y);
    }

    @Override
    public double multiplication(int x, int y) {
        incrementCountOperation();
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return super.division(x, y);
    }


}
