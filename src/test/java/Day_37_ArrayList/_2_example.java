package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _2_example {
    public static void main(String[] args) {
        //ArrayList bir Collection grubunun bir elemani
        //Sort ile burada da siralama yapiliyor. ANCAK -->Collections.sort(list);

        //bir Integer arrayList oluturduk ve deger atamasi yaptik
        ArrayList<Integer> rakamlar=new ArrayList<>()
        {
            {
                add(3);//rakamlar.add() syntex kullanmadan yaptik
                add(12);
                add(1);
                add(24);

            }
        };

        rakamlar.add(9); //Bu syntex e gore ekledik. Her ekleme en sona eklenir. Son eleman olarak

        System.out.println("ilk haldeki rakamlar = " + rakamlar);

        //sort yani siralama yapmamiz durumunda
        Collections.sort(rakamlar);
        System.out.println("Sort sonrasi rakamlar = " + rakamlar);

        //listeyi tersine cevirme
        Collections.reverse(rakamlar);
        System.out.println("Listenin tersi rakamlar = " + rakamlar);

        //tum elemanlarina TEK bir deger atama
        Collections.fill(rakamlar,8);
        System.out.println("tum elemanlara ayni deger atanmasi rakamlar = " + rakamlar);

        //listedi elemanin degerini degistirme
        Collections.replaceAll(rakamlar,8,9);
        System.out.println("yediden deger atanan rakamlar = " + rakamlar);

    }
}
