package Day_13_IfElseIf;

public class _1_ifElseIf {
    public static void main(String[] args) {

        //1- Bir sayinin 100 den kucuk olma durumuna bakiniz.
        //2- Sayinin 50 den buyuk olma durumuna bakiniz.

        //3- Sayi hem 100 den kucuk hem de 50 den buyuk olma durumuna bakiniz.
        //4- Sayinin hem 50 den buyuk hem de 100 den kucuk olma durumuna bakiniz.


        int sayi=50;

        //1. satir icin
        if (sayi<100){
            System.out.println("Sayi 100 den kucuktur.");
            if (sayi>=50){  // Birinci ve ikinci kosul saglanmasi durumunda
               // sayi+=sayi;
                System.out.println("Sayinin hem 100 den kucuk hem de 50 den buyuk olma durumu");
            }

        }

        //2. satir icin
        if (sayi > 50) {
            System.out.println("Verilen Sayi 50 den buyuktur.");
            if (sayi<100){
                System.out.println("Verilen sayi hem 50 den buyuk he de 100 den kucuk");

            }
        }




    }
}
