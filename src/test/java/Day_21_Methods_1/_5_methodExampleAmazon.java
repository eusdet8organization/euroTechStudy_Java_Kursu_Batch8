package Day_21_Methods_1;

public class _5_methodExampleAmazon {

    public static void amazonAramaMotoru(){
        System.out.println("Amazon sayfasinda Ayakkabilari arat");

    }
    public static void main(String[] args) {
        System.out.println("Main metoduna giris yaptik");
        amazonHomePage(); // amazonHomapage methoduna gider--> satir satir ilerler. amazonAramaMotoru methoduna gider
                          // --> satir satir okur ve icerisindeki amazonAyakkabilariFiltrele methoduna gider -->
                         //Methodu okuduktan sonra varsa diger satirlari compile eder.
    }
    public static void amazonHomePage(){
        System.out.println("Amazonun Ana Sayfasina gittik");
        amazonAramaMotoru();
        amazonAyakkabilariFiltrele();
    }
    public static void amazonAyakkabilariFiltrele(){
        System.out.println("Spor ayakkabilari filtreleyerek goster");
    }
}
