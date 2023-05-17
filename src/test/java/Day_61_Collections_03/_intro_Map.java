package Day_61_Collections_03;

import java.util.HashMap;
import java.util.Map;

public class _intro_Map {
    public static void main(String[] args) {

        Map<Integer,Integer> map=new HashMap<>();
        //Map objesi KEY ve VALUE deerlerini alarak olusur

        map.put(2,11); //Key 2 ve ona 11 degeri yani VALUE atandi
        map.put(3,12);
        map.put(4,13);
        map.put(5,18);
        map.put(8,56);
        map.put(2,51); //Burada 2 KEY degerine ait VALUE guncellendi
        map.put(9,51);//Farkli KEY lerin ayni degere sahip olabilir AMA farkli degerler ayni KEY alamaz.
        map.put(50,123);
        map.put(25,121);
        map.put(10,121);

        System.out.println("map = " + map);//Cikti:  map = {2=51, 3=12, 4=13, 5=18, 8=56}

//foreach ile VALUE lari yazdirma
        for (Integer value : map.values()) {
            System.out.println("value = " + value);
        }

        //foreach ile KEY lari yazdirma
        for (Integer value : map.keySet()) {
            System.out.println("value = " + value);
        }


//       for (Map.Entry(Integer,Integer) : map.entrySet()){
//
//        }  burada sadece kay ve value kismini get ile almabilmemizi saglar
    }
}
