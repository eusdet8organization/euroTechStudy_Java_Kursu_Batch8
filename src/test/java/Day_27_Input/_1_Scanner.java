package Day_27_Input;


import java.util.Scanner;//predefind olan bu class ihtiyac halinde cagrilarak calisir.
                        //import edilen bir class oldugu icin class disinda ve genellikle en ustte yer alir

import java.util.*; //Eger import edilecek olan class larin tamamini tanimlamak isterseniz
import java.util.*;

public class _1_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);//klavyeyi tanimladik
        //kullanici tarafindan bilgi girilmesini sagladik.

        System.out.print("Lutfen bir byte verisi giriniz : ");
        byte scannerByte=scanner.nextByte();// Byte olan bir veri girilmesi icin sisteme byte olarak tanimladik
        System.out.println("scannerByte = " + scannerByte);

        System.out.print("Lutfen bir short verisi giriniz : ");
        short scannerShort=scanner.nextShort();
        System.out.println("scannerShort = " + scannerShort);

        System.out.print("Lutfen bir int verisi giriniz : ");
        int scannerInt=scanner.nextInt();
        System.out.println("scannerInt = " + scannerInt);

        System.out.print("Lutfen bir double verisi giriniz : ");
        double scannerDouble=scanner.nextDouble();
        System.out.println("scannerDouble = " + scannerDouble);

        System.out.print("Lutfen bir boolean verisi giriniz : ");
        boolean scannerBoolean=scanner.nextBoolean();
        System.out.println("scannerBoolean = " + scannerBoolean);



    }
}
