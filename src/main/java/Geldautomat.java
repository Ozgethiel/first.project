package main.java;

public class Geldautomat {

    public static void main(String[] args) {
            boolean stop = false;
            int asksedPaymnent = 80;
            if (stop) {
                return;
            }
            System.out.println ("start");

            int n = asksedPaymnent;

            while  (n >= 100) {
                System.out.println(100);
                n = n - 100;
            }

            while (n >= 50){
                System.out.println(50);
                n = n - 50;
            }

            while (n >= 20){
                System.out.println(20);
                n = n - 20;
            }

            while (n >= 10){
                System.out.println(10);
                n = n - 10;
            }

            System.out.println( "finish" );
            if (n == 0) {
                System.out.println( "correct! we paid " );
                System.out.println( asksedPaymnent );
            } else {
                System.out.println( "wrong!!" );
            }
            stop = true;
        }
    }


