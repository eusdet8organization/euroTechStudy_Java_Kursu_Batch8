package Day_26_ObjectAndClass_2.ornekSoru;

public class Musteri {
    String name;
    double elektrikKullanimi;

    //ElektrikHesabi elektrikHesabi=new ElektrikHesabi();
    //Bir nesne olusturabilirim baska bir class a ait. Fakat bu nesle ile o class a ait degisken ve methodlari cagiramam

//-->Eger siz bir elektrik hesabi nesnesi ile is islem yapacaksaniz main ve Nesne olusturduk
//    public static void main(String[] args) {
//
//        ElektrikHesabi elektrikHesabi=new ElektrikHesabi();
//    }
    public double tuketimEkle(double aylikTuketim){
        return aylikTuketim+=aylikTuketim;
    }


}