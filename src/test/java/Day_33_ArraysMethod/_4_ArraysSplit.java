package Day_33_ArraysMethod;

import java.util.Arrays;

public class _4_ArraysSplit {
    public static void main(String[] args) {
        //split() --> Bir diziyi belirlenen kritere gore bolerek baska bir diziye elementleri atar.

        String tex="Bilmem ki anlatabilmek mi daha iyi yoksa aglatabilmek mi";
        String[] kelimeler=tex.split(" ");//split methodu direkt olarak elementleri olusturup, diziyi de belirli hale getirir

        //Yazdirma islemi yaptik (yazdirma icin 1. yontem)
        System.out.println("Split sonrasi kelimelerin dizideki hali :"+ Arrays.toString(kelimeler));
        
        //yazdirma icin 2. yontem
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }
        
        //yazdirmada ucuncu yontem
        for (String s : kelimeler) {
            System.out.println("s = " + s);
        }
        
    }
}
