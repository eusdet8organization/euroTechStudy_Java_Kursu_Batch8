package Gun_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_ArrayList {
    public static void main(String[] args) {

        //Deger atamanin farkli bir sekli
        ArrayList<Integer> sayilar=new ArrayList<>(Arrays.asList(15,4,6,11,44,87));
        //Burada aslinda bir belirli olan diziyi ArrayList e atadik

        System.out.println("Dizinin eleman sayisi : "+sayilar.size());//sayilar listesinin eleman sayisi buldu

        System.out.println("sayilarin 3 uncu elemani = " + sayilar.get(2));

        sayilar.add(32);
        sayilar.add(sayilar.size()); //Burada eleman sayisini yeni eleman olarak ekledim

        System.out.println("Yeni eklemeler sonrasi sayilar = " + sayilar);


    }
}
