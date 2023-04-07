package Day_30_DateAndTimeAndStringClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class _1_Date {
    public static void main(String[] args) {

        //Date ve Time  --> Zaman tanimlama icin kullanilan Date ve LocalDate in kullanimi
        Date date=new Date();
        System.out.println(date);
        //Ayni Scanner da kullanilan Sytem.in gibi sizin bilgisayardaki bilgileri okur.

        LocalDate tarih=LocalDate.now(); //New olarak bir obje veya nesne kullanmak yerine, hangi tarihi baz alacagin onemli
        //Yil-Ay-Gun seklinde sonuc verir
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());//alinan tarih icin sadece yili tanimladik ve yazdirdik
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());//aydaki gunu
        System.out.println("tarih.getMonth() = " + tarih.getMonth());//hangi ay oldugu
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());//hangi hafta oldugunu yazdirdik


        //Hazir bazi methodlar kullanilabilir, asagidaki gibi
        tarih.format(DateTimeFormatter.ISO_DATE);
        //Format icerisine kendi hazirladigim formati yazsam ve yazdirsam !!!!


        //Bu format tanimlama islemini yapar
        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd/MM/yyy");
        //gun kucuk dd harfleri ile, ay buyuk MM ile ve yil kucuk yyyy ile yazilir
        System.out.println("ozelFormat = " + tarih.format(ozelFormat));


    }
}
