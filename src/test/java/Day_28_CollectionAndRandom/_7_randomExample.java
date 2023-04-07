package Day_28_CollectionAndRandom;

import java.util.Random;
import java.util.Scanner;

public class _7_randomExample {
    public static void main(String[] args) {
        // kullanici tarafindan belirlenen sinir ile rastgele sayi(int) uretilsin ve ayrica kullanicidan sayi tahmini
        //alinsin. Esit olmasi durumunda tebrikler yazdiriniz.

        Scanner sc=new Scanner(System.in);

        Random ra=new Random();
       // int sayi= ra.nextInt(30);//0 ile 30 arasi random deger . 30 Dahil DEGIL


        System.out.println("Rastgele sayilar icin sinir belirleyiniz : ");
        int sinirSayisi= sc.nextInt();

        int uretilenSayi=ra.nextInt(sinirSayisi);//Burada boundry sayisi kullanicidan geldi

        // {0 ile kullanicinin verdigi deger arasinda rastgele gelecek degeri ifade eder}

        System.out.println("Rastgele gelecek sayiyi tahmin ediniz : ");
        int tahminSayisi=sc.nextInt();

        //if else yontemi ile kiyaslama
        if (uretilenSayi==tahminSayisi){
            System.out.println("Bravo Tebrikler");
        }else {
            System.out.println("uretilenSayi = " + uretilenSayi);
            System.out.println("Bilemedin ki , bilemedin ki");
        }

        //ternary ile yazilisi
        String sonuc=(uretilenSayi==tahminSayisi)  ?  "Bravo Tebrikler"  :  "Bilemedin ki , bilemedin ki";
        System.out.println("sonuc = " + sonuc);



    }
}
