package com.Java.Day_36_WrapperClass;

public class _1_introWrapper {
    public static void main(String[] args) {

        //program sadece rakam veya harf veya true-false gibi basit degerler hafizada
        // saklayarak cok fazla yer kaplamasin diye ayni basit tipteki degiskenler kullanildi.
        //Bu degiskenlere promitive type veya field olarak adlandirmistik.


        int a=4; //hafizada bir rakam yr tuttu. Buna basit (tip)deger denir.

        Integer b=5;//Wrapper class olarak ifade edilen class lardan Integer olani
        //Bu Integer diger int den farkli olarak, tum detaylariyla tanimlanmis oluyor;
        //-Method, fields, class a tanimli hersey gelmis oluyor.

        //Wrapper class kucuk harf ile tanimlanan BASIT deger tutan degiskenlerin BUYUK harf
        // ile yazilmasi durumuna denir. Tum detaylari ile tanimlanmis olur.Her biri CLASS tir.

        int num1=5;
        Integer num2=new Integer(5);//Bu sekilde tanimlanmasi durumunda deger atanmalidir.
        Integer num3=new Integer("5"); //String bir deger Integer a atadim

        //WRAPPER class lar object karsilastirmasi yapar
        //equals() Object lerin degerlerini karsilastirir
        //== ise Objectlerin REFERANSlarini karsilastirir

        System.out.println(num2.equals(num3));
        System.out.println(num2==num3);
        System.out.println(num2+num1);


        double dd=2;//2.0
        double d1=25.5; //basit sekilde deger atadik
        Double d2=new Double(25.5);//Wrapper Double class ile deger atadik
        Double d3=new Double(20);//20.0
        Double d4=new Double("20.5");//20.5
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println(d2+d1+d3+d4+dd);//hepsini topladik

        
        
        char ch1='c';
        Character ch2=new Character('c');//Burada char usulune uygun yeni bir objeye deger atadik
        //Character ch3=new Character("c"); String olarak Constructer deger parametresi olmadigi icin
         //String deger atamasi mumkun degil
        System.out.println("ch2 = " + ch2);
        

        //Wrapper class larin default degeri yok. Cunku constructer yani parametreli bir fonksiyon
        //calistigi icin o parametre degerleri atanmalidir.

    }
}

