package Day_39_ConstructorAndOOPintro;

public class Hesaplar {
    public static void main(String[] args) {

        TlhBank tninEuroHesabi=new TlhBank();










        tninEuroHesabi.hesapSahibi="Tim James";
        tninEuroHesabi.hesapNo=10002001;
        tninEuroHesabi.bakiye=1432;
        tninEuroHesabi.paraBirimi="Euro";
        tninEuroHesabi.karOrani=0.10;
        tninEuroHesabi.subeAdres="Kadikoy Subesi";


        TlhBank tninPoundHesabi=new TlhBank();

        tninPoundHesabi.hesapSahibi="Tim James";
        tninPoundHesabi.hesapNo=1000202;
        tninPoundHesabi.bakiye=142;
        tninPoundHesabi.paraBirimi="GBP";
        tninPoundHesabi.karOrani=0.15;
        tninPoundHesabi.subeAdres="Kadikoy Subesi2";

        TlhBank tninTlHesabi=new TlhBank();

        tninTlHesabi.hesapSahibi="Tim James";
        tninTlHesabi.hesapNo=100025;
        tninTlHesabi.bakiye=14332;
        tninTlHesabi.paraBirimi="TL";
        tninTlHesabi.karOrani=0.20;
        tninTlHesabi.subeAdres="Kadikoy Subesi3";



    }

}
