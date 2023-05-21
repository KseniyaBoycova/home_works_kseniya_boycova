package by.it.boycova.home_work3.calcs.simple;

public class CalculatorWithOperator {

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
        int counter=2;
        double square = 0.0;
        double a=x;
        while (counter<=y){
            square=a*x;
            a=square;
            counter++;
            if (counter>y){
                break;
            }
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
