package Day_60_Collections_2;

import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(2);
        setA.add(4);
        setA.add(5);


        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        //Bu iki liste ile ilgili bazi methodlar uygulayalim:  listelri birlestir, Farklarini al, Ortak elemanlarini al

        System.out.println("Birlestirilmis hali = "+birlestir(setA,setB));
        System.out.println("Farki = "+farki(setB,setA));
        System.out.println("Ortak elementler = "+ortaklar(setA,setB));


    }

    public static HashSet<Integer> birlestir(HashSet<Integer> setA,HashSet<Integer> setB){

        HashSet<Integer> birlestirilmisHashSetler=new HashSet<>();
        birlestirilmisHashSetler.addAll(setA);
        birlestirilmisHashSetler.addAll(setB);

       // setA.addAll(setB);//Bu sekilde de eklenebilir

        return birlestirilmisHashSetler;

    }

    public static HashSet<Integer> farki(HashSet<Integer> setA,HashSet<Integer> setB){
        HashSet<Integer> fark=new HashSet<>(setA);
        fark.removeAll(setB);//Burada iki liste farkini aldik


        return fark;
    }

    public static HashSet<Integer> ortaklar(HashSet<Integer> setA,HashSet<Integer> setB){
       HashSet<Integer> ortakElementler=new HashSet<>(setA);

       ortakElementler.retainAll(setB);//Burada hashSetlerin ortak elemanlarini aldik

       return ortakElementler;
    }


}
