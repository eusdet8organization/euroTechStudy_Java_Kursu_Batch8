package Day_60_Collections_2;

import java.util.ArrayList;
import java.util.Iterator;

public class _0_Iterator {
    public static void main(String[] args) {

        //next() listedeki sonraki eleman oldugunda yazdirmaya yarar,
        // ve hashNext() sonraki elemanin olup olmadigini sorar. Boolean cevap verir.
        // methodlari yer almaktadir.
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Gulden");
        isimler.add("Selim");
        isimler.add("Ramazan");
        isimler.add("Symbat");
        isimler.add("Ayse");
        isimler.add("Bilal");
        isimler.add("Ismail");
        isimler.add("GuldenT");




        Iterator itr= isimler.iterator();
//      while (itr.hasNext()){
//
//      }

      //  System.out.println(itr.hashCode());//Hascode verilen degerin karakter olarak byte code
                                           // aktarilan sayi degerini veriri, yani 0:1 degerine donusmeden onceki hali


    }
}
