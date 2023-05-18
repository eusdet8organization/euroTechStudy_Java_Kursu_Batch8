package Day_60_Collections_2;

import java.util.HashSet;
import java.util.Iterator;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> h1;//Bu sadece int degerler element olarak alir

        HashSet<Object> hsObject=new HashSet<>();//Herhanbi bir obje element olarak atanabilir
        HashSet hs2Obje=new HashSet();//Bu default olarak obje hashSet listesi olusturur(usttekinin ayni gorevi gorur)
        hs2Obje.add(5); //Default obje listesine obje ekledik
        hs2Obje.add("Bilal");//obje listesine obje ekledik
        hs2Obje.add("Ismail");
        hs2Obje.add(4);

        HashSet<Integer> h3=new HashSet<>();
        h3.add(1);
        h3.add(2);
        h3.add(34);
        h3.add(5);

        //Yadirma islemi -->int olarak e forEach ile yazdirdik
        for (int e : h3) {
            System.out.println("e = " + e);
        }


        for (Object o : hs2Obje) {
            System.out.println("o = " + o);
        }


        Iterator gosterge=h3.iterator();//bu interface olarak buraya kopyaliyor

        while (gosterge.hasNext()){

            Integer eleman= (Integer) gosterge.next();//Daha once Wrapper class Integer olan element
                                                     // Iterator interface donusturulmustu, tekrardan Integer a cevirdik
//            if (gosterge.next().equals(34)){
//                gosterge.remove();
//                System.out.println("Bu element artik yok");
//
//            }
            if (eleman==34){
                gosterge.remove();
                System.out.println("Bu element artik yok");

            }
        }

        for (Integer integer : h3) {
            System.out.println("integer = " + integer);
        }

    }
}
