package Day_28_CollectionAndRandom;

import java.util.Random;

public class _5_betweenRandom {
    public static void main(String[] args) {
        Random random=new Random();
        //Boundary
        int sayi=random.nextInt(30); //30 Dahil DEGIL , 30 a kadar
        int sayi2= random.nextInt(50); //50 Dahil DEGIL , 0 ile 50 arasinda sayi uretir. 50 a kadar

        ///////////////////////////////////////////////////
        //Between olmasi icin  ARALIKLI DEGER ATAMA
      //  int arasindaBirDegerAtama= random.nextInt(Buyuk Deger -Kucuk Deger+1)+Kucuk deger; -->Dahil olan buyuk deger

        int max=12;
        int min=5;
        int araliliDegerAlma=(int) (Math.random()*(max-min)+1)+min;//Buradaki random MATH class indan geliyor static oldugu icin
        System.out.println("raraliliDegerAlma = " + araliliDegerAlma);


        //Math olmadan yazilma sekli
        int rastgele;  //12 ile 5 arasinda deger atama
        rastgele=random.nextInt(12-5+1)+5; //(Ramdom islemi(max-min+1))+min
        //Buradi random ise yukarida tanimladigimiz nesne den geliyor
        System.out.println("rastgele = " + rastgele);
////////////////////////////////////////////////////////////////

        //30 ile 99 arasinda int rastgele deger uretiniz
        int betweenDeger=random.nextInt((99-30)+1)+30;
        System.out.println("betweenDeger = " + betweenDeger);

        ////////////////////////
        //Boolean rastgele deger atama sekli
        boolean booleanRandom=random.nextBoolean();  //iki deger alabiliyor TRUE veya FALSE
        System.out.println("booleanRandom = " + booleanRandom);

    }
}
