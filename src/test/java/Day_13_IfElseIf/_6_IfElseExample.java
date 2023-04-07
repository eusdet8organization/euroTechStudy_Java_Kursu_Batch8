package Day_13_IfElseIf;

public class _6_IfElseExample {
    public static void main(String[] args) {

        int age=25;
        int sayi=35;

        if (sayi<100){
            System.out.println("Gecerli sayi");

            if (sayi>45){
                System.out.println("Ozel sayilar");
            }else //sayinin 45 OLMAMA durumlarini ifade eder.
                if (sayi==35){
                    System.out.println("Omrun yarisini ifade eden sayi");
                }  // WRONG ANSWER => HATALI CEVAP = asagidaki else bakarak, sayinin 35 e esit olmama durumunu ifade eder.****???!!!

        }else // sayi nin 100 den kucuk olmama durumlarini ifade eder.
            System.out.println("gecersiz sayi");


    }
}
