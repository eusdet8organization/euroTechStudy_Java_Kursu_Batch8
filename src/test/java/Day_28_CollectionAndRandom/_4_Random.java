package Day_28_CollectionAndRandom;

import java.util.Random;

public class _4_Random {
    public static void main(String[] args) {
        //Random --> Rastgele sayi demek

        Random r=new Random();
        //INT deger atamasi icin
        int intRandom=r.nextInt();//Bu int degeri olarak rastgele sayi atamak demektir
        System.out.println("intRandom = " + intRandom);

        //Double rastgele deger atamasi icin
        double doubleRRandom=r.nextDouble();//Bu double degeri random olarak atamak demek
        System.out.println("doubleRRandom = " + doubleRRandom); //0.0 dahil ve 1.0 degerine kadar deger atar. (1.0 dahil degil)


        int sinirliRandomSayi=r.nextInt(30);//0 ile 30 degeri arasinda deger atamasi olur. 30 dahil DEGIL!!!
        System.out.println("sinirliRandomSayi = " + sinirliRandomSayi);

        //Math class indan random cagirabilirsiniz, cagirma sekli asagidaki gibidir
        double randomDouble=Math.random()*10;// yine 0.0 ile 1.0 arasindaki sayiyi 10 ile carparak veririr
        //random Math icerisinde static oldugu icin direkt NOKTA ile kullanabildik
        System.out.println("randomDouble = " + randomDouble);
        //Sayiyi int e cevirmek istersek yani CAST yaparsak
        int intRandomSayi=(int) randomDouble;
        System.out.println("intRandomSayi = " + intRandomSayi);



        //Random degerleri 0 ile 1 arasinda uretiliyor
        //0.0000, 0.001, 0.100, 0.231, ...... , 0.99999999 gibi degerlerden uretiliyor
    }
}
