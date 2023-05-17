package Day_61_Collections_03;

import java.util.Arrays;
import java.util.HashSet;

public class _03_LAmbda_stream {
    public static void main(String[] args) {

        Integer[] dizi={1,3,2,5,6,7,9};
        //1-Burada Hashset olarak bir dizi atayarak tanimladk
      //  HashSet<Integer> hs= (HashSet<Integer>) Arrays.asList(dizi);

        HashSet<Integer> hs1=new HashSet<>();
        hs1.addAll(Arrays.asList(dizi));//Bu cast olmadan ekleme islemini yaptik

        //talk() --> Bu method ile yazdirma islemini yapabiliyorsunuz,
       // hs1.stream().forEach(user::talk); //Bu syntex ile fonsiyonun sadece adi yaziliyor.
        // talk() DEGIL talk olarak yazilir ve "::" iki nokta ust uste iki kez yazilarak kullanilir

        hs1.stream().forEach(user-> System.out.println(user.hashCode()));


    }
}
