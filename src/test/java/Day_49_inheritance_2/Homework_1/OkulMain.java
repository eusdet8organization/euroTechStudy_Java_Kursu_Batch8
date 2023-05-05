package Day_49_inheritance_2.Homework_1;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Kartal IHL", 1000);
        Okul okul1 = new Okul("Yale", 2500);

        //Burada bu sekilde bir Ogrenci objesi ekledik
        okul1.ogrenciKayit(new Ogrenci("AyseHanim","Kartal ilcesi",okul1,520));

        //ikinci yontem ogr ekleme
        Ogrenci o1=new Ogrenci("ismailBey","balgat",okul1,425);
        okul1.ogrenciKayit(o1);

        Calisan c1=new Calisan("GuldenHanim","Gungoren",okul,12000);
        Calisan c2=new Calisan("SelimBey","Shututgard",okul,10000);
        okul.calisanKayit(c1);
        okul.calisanKayit(c2);

        okul1.ogrenciListele();
        okul.calisaListele();

    }

}
