package Day_53_Interface.Soru2;

public class Dikdortgen implements ISekil{
    @Override
    public double cevresi(int... dizi) {
       if (dizi.length==1){
           return 4*dizi[0];
       }else
           return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alan(int... dizi) {
        if (dizi.length==1){
            return dizi[0]*dizi[0];
        }else
            return dizi[0]*dizi[1];
    }
}
