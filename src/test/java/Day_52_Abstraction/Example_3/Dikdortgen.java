package Day_52_Abstraction.Example_3;

public class Dikdortgen extends Sekil{

    double uzunluk;
    double genislik;

    //kullanicidan degerlerin gelmesi, obje create ederken
    Dikdortgen(double uzunluk,double genislik){
        this.genislik=genislik;
        this.uzunluk=uzunluk;

    }
    @Override
    double alan() {
        return uzunluk*genislik;
    }

    @Override
    double cevre() {
        return 2*(uzunluk+genislik);
    }
}
