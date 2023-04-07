package com.Java.Day_36_WrapperClass;

public class _2_WrapperClassMethod {
    public static void main(String[] args) {
        //Bir class in icerisindeki method veya field lari kullanmak icin class icerisine giris sifresi NOKTA

        int maValue=Integer.SIZE; //Bunu bir degere atamaliyiz. Cunku bir method calistirip deger veriyor.
        System.out.println("maValue = " + maValue);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d=Double.MAX_VALUE;
        double d1=Double.MIN_VALUE;
        System.out.println("d = " + d);
        System.out.println("d1 = " + d1);

        byte b=Byte.MAX_VALUE;
        System.out.println("b = " + b);
        System.out.println(Byte.MIN_VALUE);





    }
}
