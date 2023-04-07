package com.Java.Day_6_DataTypeAnd_Java_Operators;

public class _1_DataTypeAndConcat {
    public static void main(String[] args) {
        
        //Cancat -> Birlestirme
        
        String example2="\"dusunmek en buyuk armaginidir insanin\"";
        System.out.println("example2 = " + example2);
        
        String example="\"\"";
        System.out.println("example = " + example);


        String satir1="dusunmek ";
        String satir2="en buyuk ";

        String siirinTamami=satir1 +satir2;
        System.out.println("siirinTamami = " + siirinTamami);

        String satir3="armaganidir ";

        siirinTamami=satir1+satir2+satir3;
        System.out.println("siirinTamami = " + siirinTamami);

        String satir4="insanin";
        siirinTamami=satir1+satir2+satir3+satir4;
        System.out.println("siirin tamami = "+siirinTamami);


        String merhaba="Hello World";
        System.out.println(merhaba);

        int sayi=11;

        System.out.println(11);
        System.out.println(sayi);
        
        int sayi1=2;
        int sayi2=5;
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);


        String tanim="Benim Yasim = ";
        int yas=35;
        System.out.println(tanim+yas); //


        int yas1=35;
        String name="ismail";
        System.out.println("Benim adim ="+name+ " ve Yasim = "+yas1);



    }
}
