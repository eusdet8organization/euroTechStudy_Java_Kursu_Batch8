package Day_30_DateAndTimeAndStringClass;

import java.util.Scanner;

public class _8_homeworks {
    public static void main(String[] args) {
       // findChar("aabbccaaddbssr");


        Scanner scan = new Scanner(System.in);
        System.out.println("Isim ve soyisim giriniz: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.charAt(0) + "." + str.charAt(i + 1) + ".");

            }
        }
    }
    public static void findChar(String str) {
        int sayi = 0;
        for (int i = 0; i < str.length(); i++) {
            sayi = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ')
                    sayi++;
            }
            System.out.println(str.charAt(i)+ " karakteri "+str +" icerisinde "+sayi+ " kez tekrar edilmistir");
        }
    }
}
