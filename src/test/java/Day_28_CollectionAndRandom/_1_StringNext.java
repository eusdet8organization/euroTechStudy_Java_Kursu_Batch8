package Day_28_CollectionAndRandom;

import java.util.Scanner;

public class _1_StringNext {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir string giriniz");


//        String cumle=scanner.next();//daha once NextLine kullandik fakat next secegini de var. Eger bunu kullanirsak
//        String cumle2=scanner.next();
//        System.out.println("cumle = " + cumle);
//        System.out.println("cumle2 = " + cumle2);

        //Next yazilan bir cumledeki kelimeleri tek tek yazdirir.
        //Her kelime icin bir next gereklidir.

//        String kelime1=scanner.next();
//        System.out.println("kelime1 = " + kelime1);
//        String kelime2=scanner.next();
//        String kelime3=scanner.next();
//        String kelime4=scanner.next();
//
//        System.out.println("Cumle ="+kelime1+kelime2+kelime3+kelime4);


        String cumle=scanner.nextLine();
        System.out.println("cumle = " + cumle);

        //NEXT ve NEXTLINE arasindaki temel fark --> next() ne yazarsan yaz bosluga kadar olan kelimeyi tek tek alir ve kullanir
                                                    //nextLine() ise ne yazarsan hepsini alir ve okur. Genelde bu kullanilir

//        String name=scanner.next();
//        System.out.println("name = " + name);






    }
}
