package Day_6_DataTypeAnd_Java_Operators;

public class _2_Characters {
    public static void main(String[] args) {
        //CHAR -> Universal Code=Unicode olarak karakterleri tanimlanmistir.

        char sembol='A'; //char degiskeni tek tirnak icerisinde tek harf barindirir.
        char sembol1='a'; // A ile a ayni degeri ifade ETMEZ



        //Decimal olarak
        char sembol2=65; // Burada A degerini decimal deger olarak algilar. Yani buyuk A dir.
        System.out.println("sembol2 = " + sembol2);

        char sembol3=97; // Decimal olarak 97 olan deger aslinda a sembolunu ifade eder.




        char harf1=73;
        System.out.println(harf1);

        char harf2=83;

        System.out.println(harf2);

        System.out.println(harf1+harf2); // Decimal degeri char olarak TEK harf disinda concat yaparsa' toplami verir.



        //Unicode seklinde yazilisi
        char sembolUnicode=0*0054;  //-> U+0054 olan unicode . ilk character sifir ve toplam isareti * olarak yazilmali

        //System.out.println(sembolUnicode);


        char harf=87;// ya decimal deger veya TEK tirnak icinde HARF yazailabilir
        double oran=87; // sayisal deger olarak oran algilar int de yazsaniz ondalikli devamini da verir.
        int sayi=87; // 10 basamakli degerleri alabilen TAM sayilardir.
        String deger="87"; // cift tirnak icerisinde tum unicode ile karakterleri yazilabilen bir kab olusturu.

        System.out.println("harf = " + harf);
        System.out.println("oran = " + oran);
        System.out.println("sayi = " + sayi);
        System.out.println("deger = " + deger);
        //Concat ile yani birlestirme ile dort ayri degiskenin eklemesi yapilabilmekte oldugunu gorduk.




        int x;
        x=8;
        //System.out.println("X is "+x);





        int y;
        y= x +1;

        System.out.println("X and Y are "+x+" and "+y);



    }
}
