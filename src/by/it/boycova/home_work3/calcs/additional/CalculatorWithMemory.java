package by.it.boycova.home_work3.calcs.additional;

import by.it.boycova.home_work3.calcs.api.ICalculator;

public class CalculatorWithMemory {


    private ICalculator calculator;

    private double lastResult;
    public double saveResult;

    public CalculatorWithMemory(ICalculator  calculator) {

        this.calculator = calculator;
    }


    public void saveLastResult(){
        saveResult= lastResult;
    }

    public double load(){
        double temporal= saveResult;
        saveResult=0.0;
        return temporal;
    }


    public double addition(double x, double y, double a){

        lastResult = calculator.addition(x, y, a);
        return lastResult;
    }

    public double subtraction(int x, int y){
        lastResult = calculator.subtraction(x, y);
        return lastResult;

    }

    public double multiplication(int x, int y){
        lastResult = calculator.multiplication(x, y);
        return lastResult;
    }

    public double division (double x, double y) {
        lastResult = calculator.division(x, y);
        return lastResult;
    }

    public double squaring (double x, int y){
        lastResult = calculator.squaring(x, y);
        return lastResult;
    }

    public double getModul (double x){
        lastResult = calculator.getModul (x);
        return lastResult;

    }

    public double getSquareRoot ( double x){
        lastResult = calculator.getSquareRoot (x);
        return lastResult;
    }



}
