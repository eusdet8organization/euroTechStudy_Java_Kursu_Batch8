package Day_20_BranchingStatementAndLabelleb;

public class _7_returnMethod {

    public static void main(String[] args) {

        //Method un kullanimi
        //Main icerisinde method sadece ADI ile cagrilir.
      //  merhaba(); //Merhaba method unu cagirdim.
        //Kosmasi soucu icindekini yazdiracaktir.

      //  yaslarinToplama() --> Parametreli yazilan bir fonksiyon, parametre sayisinca deger atanmasini bekler.
        //Sout icerisine alarak fonksiyonu yazdirdik
        System.out.println("Yaslar toplami = " + yaslarinToplama(15,33,45));


    }
    //METHOD veya Fonksiyon

    //Parametresiz bir method yazdik
    //Methodun adi : toplama
    public static void toplama(){
    }
    //Method bir is veya islemleri icerisinde barindiran fonksiyondur.
    //Main de bir methodtur
    //Method suslu parantez ile CLASS icerisinde yazilir.

    //Burada bir method yazdik. Adi: merhaba, icerisinde sadece "Hello World" yazdirma islemi yapildi
    public static void merhaba(){
        System.out.println("Hello World");
    }

    //Burada degiskenler tanimladim. Sonrasinda toplam degerini yazdirdim. PARAMETRESIZ
    //SABIT
    public static void sum(){
        int sayi1=12;
        int sayi2=5;
        int toplam=sayi2+sayi1;

        System.out.println(toplam);
    }

    //PARAMETRELI METHOD
    //Uc kisi icin verilen yaslarintoplami isteniyor.
    //Uc parametreli method yazdik
    public static int yaslarinToplama(int yas1, int yas2, int yas3) //ismin devamindaki degiskenleri tanimlama durumu PARAMETRE li
                                                            //method dur
    {
        //Belirlenen parametreler kullanilmasi beklenir.

        int result=yas1+yas2+yas3;

        return result; //RETURN bir fonksiyon veya method icerisindeki islemlerin sonucunu method cagrilinca veren KEYWORD
                       //Genellikle en sonda yazilir ve RESULT olarak tanimlanir.

    }
    //yaslarinToplami Method unda dinamik bir durum olusturduk
    //Yaslar verilince bize toplamini verecek bir fonksiyon yazdik




}
