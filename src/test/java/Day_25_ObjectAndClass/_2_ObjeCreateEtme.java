package Day_25_ObjectAndClass;

public class _2_ObjeCreateEtme {
    public static void main(String[] args) {
        //Nesne olusturmanin yolu: Asamali
        Araba bilalinArabasi; //Fabrikaya sparis verdiniz
        //Sizin adiniza bir araba sparisi verildi. Ortada araba yok
        bilalinArabasi=new Araba(); //Sizin adiniza olan araba uretildi, artik kullanilabilir

        //Nesne olusturmanin yolu: direkt olrak olusturma
        Araba ramazaninArabasi=new Araba();
        //Araba turunden bir araba uretildi. Yeni arac urettik. Bu aracin ozellikleri


        //bilalinArabasi olarak olusturulan nesnenin Araba Class in daki degiskenlerine cevap verdik.
        bilalinArabasi.yakitTuru="Deisel"; //String yakit=bilalinArabasi.yakitTuru="Deisel";
     //   bilalinArabasi.rengi="Su yesili";
        bilalinArabasi.kilometre=12000.51;
        bilalinArabasi.yili=2020;
        bilalinArabasi.model="BMW";

        System.out.println("Arabamin Yakit Turu : " +bilalinArabasi.yakitTuru);
        System.out.println("Arabamin rengi : " +bilalinArabasi.rengi);
        System.out.println("Arabamin kilometresi : " +bilalinArabasi.kilometre);
        System.out.println("Arabamin yili : " +bilalinArabasi.yili);
        System.out.println("Arabamin modeli : " +bilalinArabasi.model);
        System.out.println();
        System.out.println("***************");

        ramazaninArabasi.yakitTuru="Hybrit";
        ramazaninArabasi.rengi="Portakal";
        ramazaninArabasi.yili=2023;
        ramazaninArabasi.kilometre=2000.34;
        ramazaninArabasi.model="Mercedes";

        System.out.println("Arabamin Yakit Turu : " +ramazaninArabasi.yakitTuru);
        System.out.println("Arabamin rengi : " +ramazaninArabasi.rengi);
        System.out.println("Arabamin kilometresi : " +ramazaninArabasi.kilometre);
        System.out.println("Arabamin yili : " +ramazaninArabasi.yili);
        System.out.println("Arabamin modeli : " +ramazaninArabasi.model);


    }
}

