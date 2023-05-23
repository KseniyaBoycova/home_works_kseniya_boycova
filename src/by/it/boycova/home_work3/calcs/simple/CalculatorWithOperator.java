package by.it.boycova.home_work3.calcs.simple;

import by.it.boycova.home_work3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double addition(double x, double y, double a){
        return x+y+a;
    }

    public double subtraction(int x, int y){
        return x-y;
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
        double square = x;
        for (int i = 1; i < y; i++) {
            square*=x;
        }
        return  square;
    }

    public double getModul(double x){
        if(x>=0){
            return x;
        }
        else {
            return (x*-1);
        }
    }

    public double getSquareRoot( double x){
        double squareRoot= Math.abs(x);
        return squareRoot;
    }
}
