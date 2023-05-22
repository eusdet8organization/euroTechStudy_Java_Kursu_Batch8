package Day_62_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _02_JavaMaps {
    public static void main(String[] args) {
        //HashMap, LinkedHashMap, TreeMap --Buradaki temel ayirim strogge edilme farklaridir.
        // Yani nasil ve ne sekilde depolandigi onem arz ediyor


        //---------------HashMap------
        //Hizli islem yapabilmek icin, kendi algoritmasina gore verileri sakalr.
        Map<Integer, String>  hm=new HashMap<>();
        hm.put(9,"Fox");
        hm.put(25,"cat");
        hm.put(5,"dog");
        hm.put(10,"Bear");
        hm.put(4,"Swan");
        hm.put(50,"snake");

        System.out.println("hm = " + hm);

    //---------------LinkedHashMap------
        //Ekleme sirasina gore kaydeder.
        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"Fox");
        lhm.put(7,"cat");
        lhm.put(5,"dog");
        lhm.put(2,"Bear");
        lhm.put(4,"Swan");
        lhm.put(8,"snake");
        System.out.println("lhm = " + lhm);

        //---------------TreeMap------
        // Her zaman KEY lerin sirasina gore kaydeder.
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(9,"Fox");
        tm.put(7,"cat");
        tm.put(5,"dog");
        tm.put(2,"Bear");
        tm.put(4,"Swan");
        tm.put(8,"snake");
        System.out.println("tm = " + tm);
    }
}
