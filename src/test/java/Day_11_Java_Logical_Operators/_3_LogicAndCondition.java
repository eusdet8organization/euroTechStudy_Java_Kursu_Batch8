package Day_11_Java_Logical_Operators;

public class _3_LogicAndCondition {

    public static void main(String[] args) {


        // Bizim okula 3 yasindan buyuk ve 15 yasindan kucuk olanlari kaydediyoruz.

        //    ogr>=3 -> ogrenci 3 yasinda veya daha buyuk,
        //    ogr<=15 -> ogrenci 15 yasinda veya daha kucuk

        //   (ogr>=3 && ogr<=15) -> Return -> Boolean -> TRUE or FALSE
        //-> Ogrenci 3 yasindan buyuk  VE 15 yasindan kucuk mu? -> Boolean

        // Her iki sarti saglama ve daha fazla sart saglamasi durumunu kontrol etmek icin kullanilir.


       // (sayi==3 && sayi==5 && sayi==7 && sayi == 2 ) Rakam olarak asal bir sayi olma durumunu ifade eder.


        //EXAMPLE
        int x;
        x=6;

        System.out.println(x < 5 && x < 10);  // FALSE  -> Bir sarti saglamiyor x=6 icin

        // VE isareti klavyede 7 nin uzerindedir.










        //  VEYA isareti


       //    "||" -> veya sartini saglayan operator dik iki cizgi ile ifade edilir.


        x=7;

        System.out.println( x < 5 || x < 10); // OR yani VEYA durumunda sartlardan biri saglanmasi ile TRUE doner.
        // FALSE olmasi icin tum sartlarin saglanamiyor olmasi gerekir.


        x=3;
        System.out.println(x<=100 || x>=15 && x==4 );  //  FALSE --> Semra hanim -> DOGRU mu?
        System.out.println(x<=100 || false);  // True veya false oldugunda  sonuc TRUE





        x=35;

        System.out.println(x<20 || x<=12 || x<15 && x==36); // FALSE yani onemli olan iki islem sonrasi elde edilen
                                                           // sonuc ile diger islemi yapmak


        // Burada islem onceligi onemli degil. Sartlarin elenerek sonuca gidilmesi verimli olacaktir.







    }
}
