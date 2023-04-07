package Day_22_Methods_2;

public class _2_MethodLocalVariable {

    public static void main(String[] args) {

        int yas=12;

       // int yas=25;  int gerek yok

        toplama(18, 55);
        toplama(45,31);


    }

    public static void toplama(int toplam, int sayi){
       // int sayi=10; // Bir degisken hem parametre hem de local variable olarak ayri ayri tanimlanmaz.
     //   int sayi veya int toplam  --> Sadece degiskenin degerini atayip veya degistirebiliriz.

        toplam=25;

        toplam +=sayi;

        System.out.println("toplam = " + toplam);
        int yas;
        yas=25;
    }
}
