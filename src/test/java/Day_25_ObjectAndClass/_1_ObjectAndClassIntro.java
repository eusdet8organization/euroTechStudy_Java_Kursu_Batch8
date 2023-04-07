package Day_25_ObjectAndClass;

public class _1_ObjectAndClassIntro {

    public static void main(String[] args) {

        int number;

        toplama(); //Method cagirdik.

    }
    //Main methodu gibi bir methot CLASS icinde method yazmayi ogrendik.
    //Exaample
    public static void toplama(){

    }
}

//ilk olarak method disina cikip method yazdik. Simdi CLASS disina cikip bir ARABA isimli class olusturduk
//Class olusturmanin bir yontemi bu sekilde

class Araba1 {
    //Herhangi bir method yazmadan degisken tanimladik. Bu degiskenler ClassName ile iliskili ve genel tanima uygun
    //Degiskenler
    String model;
    int yili;
    String rengi;
    double kilometre;
    String yakitTuru;

    //Araba class in icine bir donus degeri olmayan void bir method yazdim, yazdirma islemi yapiyor.
    //static olmadan method create ettik. Cunku main methodu ve statik kavrami yok
    public void yazdir(){

        String info="Arabanin modeli [ "+model+"], Arabanin yili [ "+yili+" ], Arabanin rengi [ "+rengi+
                "], Arabanin kilometresi ["+kilometre+" ], Arabanin Yakit turu [ "+yakitTuru +"]";

        System.out.println("info = " + info);

    }

}






