package Day_39_ConstructorAndOOPintro;

public class TlhBank2 {
    public static void main(String[] args) {

        TlhBank hesap1=new TlhBank();   //Bir obje create ettik

        System.out.println(hesap1.hesapAktifMi);//constructor icerisinde atanan degerleri kullaniyor
        System.out.println(hesap1.checkBalance);//
        System.out.println(hesap1.bankaAdi);//




        //DEFAULT degerleri constructor ile atanmaktadir.
        System.out.println(hesap1.subeAdres);//null
        System.out.println(hesap1.karOrani);//0.0
        System.out.println(hesap1.bakiye); //0



        hesap1.hesapSahibi="Tim James";
        hesap1.hesapNo=10002001;
        hesap1.bakiye=1432;
        hesap1.paraBirimi="Euro";
        hesap1.karOrani=0.10;
        hesap1.subeAdres="Kadikoy Subesi";


    }
}
