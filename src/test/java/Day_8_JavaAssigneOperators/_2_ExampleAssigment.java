package com.Java.Day_8_JavaAssigneOperators;

public class _2_ExampleAssigment {
    public static void main(String[] args) {


        int rakam=2;  // Bu degeri bir arttirmak istiyorum

        rakam=rakam+1; // Bu sekilde bir arttirilabilir.


        System.out.println("rakam = " + (rakam +1)); // Bu sekilde 1 arttirilabilir


        System.out.println("rakam++ = " + rakam++);//Bu sekilde de bir arttirilabilir. FAKAT



        rakam++;
        System.out.println("rakam = " + rakam);



        //ONCESINDE  POST


        int sayi=1;
        System.out.println(sayi); // sayi -> 1 dir

        System.out.println("sayi = " + sayi++); //2  // Burada sayi okunduktan yani yazdirildiktan sonra artti ve 2 degerine ulasti
        //System.out.println(343456);


        sayi++;
        System.out.println("sayi = " + ++sayi);

        //SONRASINDA PRE

        System.out.println("sayi = " + ++sayi); //3 Burada once sayiyiy bir arttirdi ve sonrasinda yazdirdi. 3 degerini yazdirdi


        int sayi1, sayi2, sayi3;





        int sayac=5;

        sayac++;

        sayac=sayac+1;

        // Bu iki sekilde sayac bir arttirilabilir.


       // NEGATIF olarak

        sayac--;
        sayac=sayac-1;

      //  sayac degerinde bir azaltma yontemleridir.

        //ONEMLI -> sayinin ne zaman bu arttirimi gerceklestirdigi cok onemlidir.

        //cunku sayi oncesinde veya sonrasinda bu UNARY arttirma veya azaltma yapilabiliyor.

        ++sayac;
        --sayac;







    }
}
