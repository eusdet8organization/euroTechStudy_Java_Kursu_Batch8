package Day_60_Collections_2;

import java.util.*;

public class _04_Sets {
    public static void main(String[] args) {
        //SETS : LinkedHashSet, HashSet, ThreeSet

        //Container islemindeki siralama ile ilgilidir. Ekleme bicimleri ve listelemede kullanilmaktadilar

        //Hash algoritmasina bagli ekleme yapar ve siralar
        Set<String > hashSetList=new HashSet<>();
        hashSetList.add("Bir");
        hashSetList.add("Iki");
        hashSetList.add("Uc");
        hashSetList.add("Dort");
        hashSetList.add("Bes");
        System.out.println("hashSetList = " + hashSetList);


        //Ekleme sirasina gore elementleri saklar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Bir");
        lhs.add("Iki");
        lhs.add("Uc");
        lhs.add("Dort");
        lhs.add("Bes");
        System.out.println("Lhs listesi ="+lhs);

        //Alfabetik siraya gore elementleri saklar
        TreeSet<String> trhs=new TreeSet<>();
        trhs.add("Bir");
        trhs.add("Iki");
        trhs.add("Uc");
        trhs.add("Dort");
        trhs.add("Bes");

        System.out.println("trhs = " + trhs);


        //Integer degerleri kucukten buyuge siralar
        TreeSet<Integer> intThreeSetList=new TreeSet<>();

        intThreeSetList.add(4);
        intThreeSetList.add(9);
        intThreeSetList.add(23);
        intThreeSetList.add(456);

        System.out.println("intThreeSetList = " + intThreeSetList);//expected result := [4, 9, 23, 456]

        Integer[] dizi={1,2,3,4,5,5,4};   //Bir dizi tanimladik

        //TODO:Burada birlestir, ortak elementleri al, farkini al (Ek odev)
        HashSet<Integer> hs1=new HashSet<>(Arrays.asList(dizi));//Burada diziyi SET e atadik
        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(1,8,3,4));
    }
}
