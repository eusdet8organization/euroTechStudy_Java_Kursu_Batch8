package Day_41_Encupsulation.Example;

import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {

       // Ogrenci ogr=new Ogrenci();
        Okul okul1 = new Okul();

        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Maksimum ogrenci sayisiniz giriniz : ");
        int sayi=sc.nextInt();
        okul1.setMaxOgrenciSayisi(sayi);

        int sayac=1;
        do {

            System.out.println("Ogrenci adini giriniz : ");
            String ogrAd=sc2.nextLine();

            System.out.println("Ogrenci soyAdini giriniz : ");
            String ogrSoyAd=sc2.nextLine();

            System.out.println("Ogrencinin yasini giriniz : ");
            int ogrYas=sc.nextInt();
            Ogrenci ogr=new Ogrenci(ogrAd,ogrSoyAd,ogrYas);

            if (ogrYas<=15){
                okul1.getOgrenciler().add(ogr);//Burada bir ogrencinin ogrenciler listesine eklemesini yaptik
                     sayac++;}

        }while (sayac<= okul1.getMaxOgrenciSayisi());





    }
}
