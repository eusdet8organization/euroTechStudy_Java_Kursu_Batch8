package Day_18_NestedForLoops;

public class _10_BreakContinueExample {
    public static void main(String[] args) {
        int sayi=13;
        int toplam=0; // instance variable --> eger islemlerin ustunde tanimlamazsaniz, sadece tanimladiginiz suslu parantez
                     // icerinde kullanabilirsiniz. Ya da yer aldigi statement icerisinde kullanilabilir.

        for (int i=1; i<=5; i++){

            if (sayi>5 && sayi<20){

                System.out.println("Girilen sayi 5 ile 20 arasindadir. ");
                //continue;// ATLA anlaminda idi. For icerisindeki kod blogunu atlamasini soyler. CONTINUE
                break;
            }
            toplam=sayi+i; // Bu islem gerceklesmedi continue icin.

        }
        System.out.println(toplam);


        //BREAK --> For dongusunu bitirir. Donguyu kendisi calisana kadar calismasina izin verir.

        //CONTINUE --> Kendisinden sonra gelen KOD BLOGUNU veya STATEMENT kismini ATLAR, dongu devam eder. Her defa ayni atlama olur
    }
}
