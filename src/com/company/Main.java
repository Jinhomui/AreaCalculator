package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5,10));
        System.out.println(area(-1,1));
        System.out.println(area(5));
        System.out.println(area(-1));
    }

    public static double area(double radius) {
        //public static "primitive type" "method name"("Primitive type" "parameter")
        if (radius < 0) {
            System.out.println("Invalid radius");
            return -1;
        }
        double A = Math.PI * radius * radius;
        return (A);
    }


    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Invalid parameter");
            return -1;
        }
        double A = x * y;
        return (A);
    }

}
