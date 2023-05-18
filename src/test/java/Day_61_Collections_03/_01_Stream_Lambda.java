package Day_61_Collections_03;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _01_Stream_Lambda {
    public static void main(String[] args) {
        List<String> sehirler=new Stack<>();
        sehirler.add("Istanbul");
        sehirler.add("Izmir!");
        sehirler.add("Bolu");
        sehirler.add("Urfa");
        sehirler.add("Antep!");
        sehirler.add("Diyarbakir");


      //  sehirler.stream().forEach(x -> {System.out.println("Merhaba Stream");System.out.println(x.toString());});


        sehirler.stream().filter(a-> a.length()>5).forEach(a-> System.out.println(a));
        //sehirler.stream().filter(a-> a.length()>5) size elemet uzunlugu 5 den buyuk olanlarin listesini verir. Yazdirmaz
        //forEach(a-> System.out.println(a))  size bir listenin LAMBDA ile yazdirma islemini sagladi

        System.out.println("**************************");
        //Uzunluklari 5 den buyuk olan elementleri yeni bir listeye atadim
        List<String> yeniList=sehirler.stream().filter(x -> x.length()>5).collect(Collectors.toList());
        System.out.println(yeniList);

        //Bildigimiz classic ForEach yontemi
        for (String a : sehirler) {
            System.out.println("a = " + a);
        }

        //Lamda ile yazilisi
       sehirler.forEach(a-> System.out.println(a));


       //Stream ve Lamda ile bir seri uzerindeki akisi ifade eden ve farkli methodlari uygulamamizi kisa bir
        // yoldan uygulamamizi saglar.

        System.out.println(sehirler.stream().filter(z -> z.contains("D")).count());
        //Yukarida bir listenin filtreleme parametresini dilediginiz gibi belirliyor ve sonrasinda bu filtreli
        // elementleri kullaniyoruz
        //Burada buyuk D harfini barindiran elemenlerinin sayisini bulmaya calistik


    }





    public static void aa(String str){
        if (str.length()>5){

        }

    }




}
