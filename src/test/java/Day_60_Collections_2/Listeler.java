package Day_60_Collections_2;

import java.util.*;

public class Listeler {
    public static void main(String[] args) {
//Normal liste
        List<String> sehirler=new ArrayList<>();

        sehirler.add("oslo");
        sehirler.add("Istanbul");
        sehirler.add("Londra");
        sehirler.add(3,"Antalya");
        System.out.println("birinci element degistirilmeden sehirler = " + sehirler);
        sehirler.set(0,"Bolu");//update oldugu icin set methodunu kullandik
        System.out.println("sehirler = " + sehirler);
        System.out.println("sehirler.isEmpty() = " + sehirler.isEmpty());
        //sehirler.clear();
        Collections.sort(sehirler);
        System.out.println("Clear den sonra sehirler = " + sehirler);

        //LinkedList
        List<Integer> rakamlar=new LinkedList<>();
        rakamlar.add(100);
        rakamlar.add(90);
        rakamlar.add(10);
        rakamlar.add(25);
        rakamlar.add(44);
        rakamlar.add(20);
        System.out.println("LinkedList olarak rakamlar = " + rakamlar);
        Collections.sort(rakamlar);
        System.out.println("Sort methodundan sonra rakamlar = " + rakamlar);


        List<String> ulkeler=new Vector<>();
       // System.out.println("ulkeler.size() = " + ulkeler.size());
        ulkeler.add("Istanbul");
        System.out.println("ulkeler.size() = " + ulkeler.size());
        Collections.sort(ulkeler);
        ulkeler.addAll(sehirler);
        System.out.println("ulkeler = " + ulkeler);
    }
}
