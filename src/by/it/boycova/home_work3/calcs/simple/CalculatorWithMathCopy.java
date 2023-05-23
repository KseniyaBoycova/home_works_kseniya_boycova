package by.it.boycova.home_work3.calcs.simple;

import by.it.boycova.home_work3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {


    public double addition(double x, double y, double a){
        double summ= x+y+a;
        return summ;
    }

    public double subtraction(int x, int y){
        double difference= x-y;
        return  difference;
    }

    public double multiplication(int x, int y){
        double product= x*y;
        return product;
    }

    public double division (double x, double y){
        double quotient= x/y;
        return  quotient;
    }

    public double squaring (double x, int y){
        double square= Math.pow(x,y);
        return  square;
    }

    public double getModul(double x){
        double modul= Math.abs(x);
        return modul;
    }

    public double getSquareRoot( double x){
        double squareRoot= Math.sqrt(x);
        return squareRoot;
    }
}
