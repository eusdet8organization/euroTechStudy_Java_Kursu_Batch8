package Day_5_DataType;

public class _1_DataType {
    public static void main(String[] args) {  // Main methodu. suslu parantez icinde yer alan hersey methoda ait.


        boolean ogrenciMisin;  // Benim bir ogrenciMisin diye bir degiskenim var ve bu degisken iki cevapli boolean degiskenidir.

        ogrenciMisin=true;

        // byte days=128;  -> Data Type alabilecegi degerin fazlasini vedin' ben bunu tasiyamam

        byte yas=102;

        System.out.println("Hello World"); // Sabit bir icerik yazdiriyor. Bu cift tirnak ile yapilir.

        System.out.println("Bireyin Yasi= ");



        System.out.println("Bireyin Yasi= "+yas); //Sabit ile birlikte dinamik bir deger var burada

        yas=103;
        System.out.println(yas);  // Burada sadece yasi yazdirdi. ****Yas son atanan degeri yazdi

                                 //Bir degisken olusturulduktan sonra en son atanan deger' degiskenin degeri oluyor,
                                 // Bu atamada onceki deger kayboluyor. Eger ayni isimle degisken kullanirsak.
        yas =111; // artik yas bu satir okunduktan sonra 111 olarak degismis olacaktir.

       //*** byte  yas=112;   // eger bir degiskenin type belli olduktan sonra ayni degisken icin type yazilmaz.


        /*
        Boolean degisken disinda diger premitive types sifir degeri alir DEFAULT olarak.

        Boolean degeri default olarak FALSE dir.
         */

        double taxRate=12.5;

        double tax1;
        //Degiskenlere dair bir tanimlama;
       //*** System.out.println(tax1); // Burada degiskeni method icinde tanimladiginiz icin bir deger atamalisiniz.
                                 // Yoksa hata verir.

        System.out.println("Benim vergi oranim = "+           taxRate);

      // ->  double taxRate=13;  -> buradaki hata degisken tanimlandiktan sonra tekrar yazilmasi

        taxRate=15;
        System.out.println("Benim vergi oranim =     "    + taxRate);
        //cift tirnak icerisinde verilen bosluk kullanilmakta FAKAT cift tirnak disinda kod yazarken olusturalan bosluklar okunmaz.

        //Bir double degere tam say atayabiliriz. Olusturulan bir degiskene verdigimiz 15 degerini 15.0 olarak yazdirdi.

        //NEDEN? -> Cunku bu oran ifade etmektedir. Yani kabimiz Double.

        int ogrNo=12318585;
        System.out.println(ogrNo);

        System.out.println("ogrenci numaram = "+ ogrNo);//cift tirnak icindeki sabit, sonrasi dinamik

        ogrNo=34223;
        System.out.println("ogrenci numaram = "+ ogrNo);

        int ogrNo1=896586;

        int kazanc;  //DEFAULT sekilde degiskenin tanimlanmasi ve int default degeri "o" dir.



        //Degiskenlere dair bir tanimlama;
        //*** System.out.println(kazanc); // Burada degiskeni method icinde tanimladiginiz icin bir deger atamalisiniz.
        // Yoksa hata verir.


        int sayi;
        sayi=231;  //Degisken type alacagi value yani degeri belirleyen kab.
        System.out.println("Benim Fovari Degerim = "+sayi);




    }// -> bu parantez Main methoduna ait suslu parantez.

}//-> Bu parantez class a ait
