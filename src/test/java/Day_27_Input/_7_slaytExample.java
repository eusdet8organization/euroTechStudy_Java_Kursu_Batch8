package Day_27_Input;

import java.util.Scanner;

public class _7_slaytExample {
//    public static void main(String[] args) {
//
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter Double value");
//        double radius= input.nextDouble();
//
//        double area=radius*radius*3.14159;
//        System.out.println("The area for the circle of radius "+radius+" is   "+area);

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sayi;
            int rakamToplami;

            do {
                System.out.println("Lütfen bir sayi giriniz");
                sayi = scan.nextInt();

                int rakam = 0;
                rakamToplami = 0;
                while (sayi > 0) {
                    rakam = sayi % 10;
                    rakamToplami = rakam+rakamToplami;
                    sayi /= 10;
                }
                System.out.println("rakamToplami = " + rakamToplami);
            } while (rakamToplami < 9) ;

    }
}
