package Day_58_Error_Execption_02;

import java.util.Scanner;

public class _03_TrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Kullanici adi giriniz = ");
        String username= oku.nextLine();

//        if (username.length()<6){
//            System.out.println("Kullanici adi 6 karakterden az olamaz");
//        }
//
//        if (username.length()>10){
//            System.out.println("Kullanici adi 10 karakterden fazla olamaz");
//        }

        try {
            if (username.length()<6)
                throw new Exception("Kullanici adi 6 karakterden az olamaz");
            //throw ile kendimiz hata olusturuyoruz. Boylece kriterleri saglamayan durumlar icin
            //catch bloguna dusurerek pratik bir kullanim saglamis oluyoruz

            if (username.length()>10)
                throw new Exception("Kullanici adi 10 karakterden fazla olamaz");
        }catch (Exception ex){
            System.out.println("Hata = "+ex.getMessage());
            //log tutuyor
            //Kimler hatali giris yapmis, ne zaman yapmis, hangi tur hatalar daha fazla yapiliyor
            //...
            //Bircok kontrol tek yerde tutulmus oluyor

        }



//        try {
//            Thread.sleep(1000);//Bir saniye demek
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //Thread bir is parcasi, JVM deki PAUSE tusuna basmak gibi durdurma anlamini tasir


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
