package com.Java.Day_11_Java_Logical_Operators;

public class _1_Examples {

    public static void main(String[] args) {

        int sayi=1;
        sayi++;

        System.out.println("sayi++ = " + sayi++); // burada sayi 2 yazdirilir fakat satir bitiminde sayi 3 olur.
        //yazdirilacak sayinin sonrasina ekleme yapildi ise, yazdirma sonrasi sayinin degeri degisir.

        System.out.println("sayi = " + sayi);  // burada sayi=3

        System.out.println("++sayi = " + ++sayi); // eger sayinin onunde ++ veya -- varsa, yazdirma isleminden once
                                                    // islem yapilir ve sonrasinda yazdirilir.



    }
}
