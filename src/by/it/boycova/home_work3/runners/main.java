package by.it.boycova.home_work3.runners;

public class main {
    public static void main(String[] args) {
        int counter=1;
        double x=5.6;
        double y=2;
        double square = 0.0;
        double a=x;
        while (counter<=y) {
            square = a * x;
            a = square;
            counter++;
            System.out.println(square);
            if (counter > y) {
                break;
            }

        }
        System.out.println(square);

    }

}
