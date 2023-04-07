package Day_26_ObjectAndClass_2.devami;

public class Main {
    public static void main(String[] args) {
        Musteri musteri= new Musteri();

        musteri.name = "Necdet";

        ElektrikHesabi hesap=new ElektrikHesabi();

        musteri.elektrikHesabi = hesap;

        musteri.elektrikHesabi.tuketimEkle(100);
        musteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("toplam tüketim = " + musteri.elektrikHesabi.toplamTuketim);

        System.out.println("ödenecek tutar = " + musteri.elektrikHesabi.odenecekTutar());//2.Yöntem
        System.out.println("ödenecek tutar (2) = " + musteri.elektrikHesabi.fatura);//1.Yöntem


    }
}
