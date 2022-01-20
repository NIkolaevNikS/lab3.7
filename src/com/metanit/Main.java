package com.metanit;

public class Main {

    public static void main(String[] args) {
        double a = 2.7;
        double b = 1.5;
        double x = 2.53;
        double y;
        if(x<=-1){
            y = 1/Math.pow((1+x),2);
            System.out.println(y);
        }
        else if (x > 1) {
            y = Math.pow(x,2)+Math.cos(a);
            System.out.println(y);
        }
        else if (x>-1 && x <= 1) {
            y = Math.sin((a * x) + b);
            System.out.println(y);
        }
    }
}