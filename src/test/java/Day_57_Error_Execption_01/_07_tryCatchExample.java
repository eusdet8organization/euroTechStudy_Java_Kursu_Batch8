package Day_57_Error_Execption_01;

import java.util.Scanner;

public class _07_tryCatchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //Hatanin olma ihtimali olan kadlar bu blockta yer alir
        try {
            System.out.println("Birinci sayiyi giriniz : ");
            int sayi1= sc.nextInt();
            System.out.println("Ikinci sayiyi giriniz : ");
            int sayi2= sc.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("Bolum : "+bolum);

        }
        //Hata olma durumunda calisacak bolum
        catch (Exception hata){
            System.out.println("Hata oldu");
            System.out.println("exception.getMessage() = " + hata.getMessage());
            hata.printStackTrace();//printStackTrace() methodu , consolda hata
                                  // oldugunda yazdirilan kirmizi
                                  // detaylari yazdirmaya yariyor

        }
    }
}
