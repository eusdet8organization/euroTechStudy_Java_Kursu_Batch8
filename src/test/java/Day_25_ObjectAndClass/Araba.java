package Day_25_ObjectAndClass;

class Araba {
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
