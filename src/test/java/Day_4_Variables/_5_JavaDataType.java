package Day_4_Variables;

public class _5_JavaDataType {
    public static void main(String[] args) {

        boolean evliMisin=true;  // true veya false cevabi olan degiskenler icin kullanilir.
         // Defualt olarak FALSE doner.

        boolean evliMisin1;  // Cevabi FALSE dir.VARSAYILAN deger diyebiliriz.

        boolean ogrenciMisin; // Evet veya HAYIR cevabi olan bir degisken oldugunu ifade etmektedir.

        byte month=5;  // kucuk degerler icin (-128 ile +127 arasindaki degerler icin)

        //Default degeri olarak 0 alir.

        short dateForDays=18;

         //Byte den buyuk ancak yine 3 rakamli bin rakamlarini yazmak icin kullanilir.
        // (-32,768 ile +32,767 arasindaki degerleri ifade etmektedir.)   -> Default degeri olarak 0 alir.

        char nameOffirstCharacter='A'; // TEK tirnak isareti ile bir character ifade etmek icin kullanilir.

        int deger=876543; //  -> Default degeri olarak 0 alir.

        long buyukDeger=345678765L; // sonuna L ekleyerek integer olan bir degerin Long oldugunu belirttik.

        double taxRate=12.6;   // kusurlu sayilar yani daha cok vergi orani ve benzeri oranlari ifade etmek icin kullanilan degiskendir.

        byte minByteDeger=Byte.MIN_VALUE;
        byte maxByteDeger=Byte.MAX_VALUE;
        System.out.println(minByteDeger);
        System.out.println(maxByteDeger);

        short minShortDeger=Short.MIN_VALUE;
        short maxShortDeger=Short.MAX_VALUE;
        System.out.println(minShortDeger);
        System.out.println(maxShortDeger);


        int minIntDeger=Integer.MIN_VALUE;
        int maxIntDeger=Integer.MAX_VALUE;
        System.out.println(minIntDeger);
        System.out.println(maxIntDeger);

        char chatMaxValue=Character.MAX_VALUE;
        char chatMinValue=Character.MIN_VALUE;
        System.out.println(chatMinValue);
        System.out.println(chatMaxValue);










    }
}
