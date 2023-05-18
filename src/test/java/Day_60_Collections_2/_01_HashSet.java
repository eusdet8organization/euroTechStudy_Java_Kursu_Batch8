package Day_60_Collections_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _01_HashSet {
    public static void main(String[] args) {
        int a=5;//hafizada tek bir yer tutar
        int[] dizi=new int[3];//hafizada 3 element icin yer tutar
        int[] dizi1={ 3,4,5};
        int   tablo[][]=new int[4][4];//2D array oldugundan -16 lik yer tutar

        //element sayisina gore dinamik sekilde yer tutma altyapisini saglayan listeler
        List<Integer> sayilar=new ArrayList<>();// bir listeyi dinamik halde tutar
        List<List<String >> isimlistesi=new ArrayList<>();//Dinamik listelerin tutuldugu liste

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(34);
        rakamlar.add(4);
        rakamlar.add(35);
        rakamlar.add(45);
        rakamlar.add(5);
        rakamlar.add(5);
        System.out.println("sayilar.size() = " + rakamlar.size());
        System.out.println("rakamlar = " + rakamlar);

        //Burada bir elementi kac kez yazdiginizin onemi yoktur. Her eklenen diziye eklenir



        //HasSet tekrarlanan elementleri yazdirmaz ve listeye eklemez. Bos yere element olusturmaz. Refere eder
        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(24);
        integerHashSet.add(5);
        integerHashSet.add(4);
        integerHashSet.add(24);
        integerHashSet.add(35);
        integerHashSet.add(9);
        integerHashSet.add(9);

        System.out.println("integerHashSet = " + integerHashSet);
        System.out.println("integerHashSet.size() = " + integerHashSet.size());




        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Black");
        renkler.add("Blue");
        renkler.add("black");
        renkler.add("Black");

        //1. yazdirma yontemi
        System.out.println("renkler = " + renkler);

        //2. yazdirma yontemi ForEach
        for (String s : renkler) {
            System.out.println("s = " + s);
        }

        //3. yazdirma yontemi
        Iterator gosterge=renkler.iterator();
        while (gosterge.hasNext()){//Sonraki eleman var mi
         //   System.out.println(gosterge.next());//Sonraki degeri yazdiracak

            if (gosterge.next()=="Blue"){//iterator interface sinifinin sonraki elementini cagirdik ve blue
                                          // ile verify ettik
                gosterge.remove();//Yani silme methodunu kullandik(iteratora ait silme yaptik)
            }
        }
        System.out.println("while sonrasi renkler = " + renkler);
        renkler.remove("Red");//HashSet ait silme methodu
        System.out.println(renkler);
        renkler.clear();
        System.out.println("renkler = " + renkler);


    }
}
