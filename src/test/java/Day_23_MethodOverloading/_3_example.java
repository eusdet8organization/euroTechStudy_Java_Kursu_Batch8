package com.Java.Day_23_MethodOverloading;

public class _3_example {
    public static void main(String[] args) {
        primeNumber(124);
    }

    public static void primeNumber(int say){

        if (say==0 || say==1){
            System.out.println("False");
        }else
            System.out.println("True");



    }
}
