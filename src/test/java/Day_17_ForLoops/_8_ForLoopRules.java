package Day_17_ForLoops;

public class _8_ForLoopRules {
    public static void main(String[] args) {

        // 1- Bir infinitive for dongusu olusturma

        //Hicbir sart ve tanimlama olmazsa kod calisir ve sonsuz donguye girer,
//        for (  ;  ;  ) // ilk noktali virgulden once tanimlama kismi ifade eder. Zorunlu degildir. Dongunundisinda tanimlanabilir
//                       //iki defa noktali virgul yazilmasi gerekir
//                      //iki tane noktali virgulun icerisinde dongunun sarti yazilir
//                      //ikinci noktali virgulden sonra ise artis veya azalis degeri yazilir
//
//        {
//            System.out.println("Hello new QAs");  //For un kod blogunu tanimlar
//        }

   //     int i=1; // Degisten tanimlamayi for disinda yapip diger kisimlari for icinde yazdik
//        for (; i<=10;i+=2){
//            System.out.println("i = " + i);
//        }

//        int i=1;
//        for ( ; ; i++){// Tanimlama disarda yapip sadece artis ve azalis tanimlandi, dongu sarti yok
//                       // sonsuz dongu
//            System.out.println(i);
//        }
//
//

        int i=1; // tanimlama yapildi, dongu sarti eklendi, artis azalis yok
        for (; i<=15;){  // sayi sonsuz donguye giriyor
            System.out.println("i = " + i);
        }
    }
}
