package Day_53_Interface.Soru2;

public class Cember implements ISekil{
    @Override
    public double cevresi(int... dizi) {
        return Math.PI*2*dizi[0]; //burada math class sindan Pi degerini aldik ve dizinin ilk degerini
        // yaricap olarak belirlemis olduk  (2*PI*r)
    }

    @Override
    public double alan(int... dizi) {
        return Math.PI*dizi[0]*dizi[0];//PI*r*r
    }
}
