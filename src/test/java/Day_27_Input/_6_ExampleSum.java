package Day_27_Input;

import java.util.Scanner;

public class _6_ExampleSum {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen bir sayinin rakamlarinin toplamini veren programi yaziniz.
        //Ornegin klavyeden girilen 1234 --> 1+2+3+4=10 gibi
        //Method kullaniniz.
        int sayi;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        sayi=scanner.nextInt();

        

        int sonuc=rakamlarinToplami(sayi);
        System.out.println("Girilen sayinin rakamlarinin toplami = "+sonuc);
    }
    public static int rakamlarinToplami(int sayi){
        //algoritma kuralim
        //  38 bu sayinin rakamlarini alma yontemi--> 10 na modunu alip birler basamagini alma yontemi
        int rakam=0;
        int rakamToplami=0;
        while (sayi!=0){
            rakam=sayi % 10;//10 na bolumunden kalan veya rakam alma bicimi
            rakamToplami=rakam+rakamToplami; //rakamToplami+=rakam;
            sayi/=10; //sayi=sayi/10;
        }
        return rakamToplami;
    }
}
