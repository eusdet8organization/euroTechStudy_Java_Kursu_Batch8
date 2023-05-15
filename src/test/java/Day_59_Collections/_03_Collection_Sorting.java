package Day_59_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _03_Collection_Sorting {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Peterson");
        cities.add("Jersey City");
        cities.add("Cliftion");
        cities.add("Passaic");
        cities.add("Atlantic City");
        cities.add("Salem");

        System.out.println("Before Sorting "+cities);

        Collections.sort(cities);
        System.out.println("After Sorting "+cities);

        System.out.println(cities.get(0));//Bu verdigimiz index teki elementi cagirir , getirir
        System.out.println(cities.get(3));

        cities.set(3,"Garfield");//Verilen index teki degeri degistirir
        System.out.println("Index 3 deki element degistirildi = "+cities);

        cities.remove(0);//Verilen index teki elementi siler
        System.out.println("0 indexindeki element silindi = "+cities);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Brooklyn");
        arrayList.add("Manhattan");
        arrayList.add("Bay Bridge");

        cities.addAll(arrayList);//Burada bir liste direkt olarak eklenebilir
        //cities.removeAll(cities);//Tum elementleri silmek icin

        System.out.println("Add All sonrasi = "+cities);

        cities.clear();//Bu tum listeyi siler









        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(55);
        integerArrayList.add(5);
        integerArrayList.add(45);
        integerArrayList.add(44);
        integerArrayList.add(67);
        integerArrayList.add(9);
        System.out.print("Sorting oncesi Liste = ");
        System.out.println(integerArrayList);

        Collections.sort(integerArrayList);
        System.out.print("Sorting sonrasi Liste = ");
        System.out.println(integerArrayList);



//Sorting IMPOSSIBLE
        List<Object> objectList=new ArrayList<>();
        objectList.add("Selim");
        objectList.add("Symbat");
        objectList.add(32);
        objectList.add(3);
        objectList.add(62);

        //Collections.sort(objectList); Edilememesinin sebebi: Obje olarak ifade edilen data type
        //Cok fazla franksiyon barindirdigi icin, kiyaslanmasi mumkun olmuyor








        ArrayList<Integer> aa=new ArrayList<>()
        {
            {
            add(4);
            add(5);
            add(3);

            }
        };

        aa.add(34);//Bu sekilde ekleniyordu, yukaridaki gibi ekleme yapilabilir





        ArrayList<String> bb=new ArrayList<>()
        {
            {
                add("Ahmet");
                add("Mehmet");
                add("Samet");

            }
        };

        bb.add("Namet");

        System.out.println(bb);

        String str=new String("Apple");

        bb.add(str);

        bb.add("Ahmet");
        bb.add("Kemal");

        bb.add(new String("Ahmet"));//Burada sadece tek element eklenekse bu sekilde eklenebilir


        System.out.println(bb);


        bb.addAll(3,new ArrayList<>() {
            {
                add("Ahmet");
                add("Mehmet");
                add("Samet");

            }});




        ArrayList<String> yeniList=new ArrayList<>();
        yeniList.add("Selma");
        yeniList.add("Busra");
        yeniList.add("Esra");
        yeniList.add("Fatma");

        bb.addAll(yeniList);//Burada ayni type yapisinda olan listeyi baska bir listeye ekledik
        System.out.println(bb);







        //Burada uc tane liste var, --> bb String listesi, String yeniList, aa adinda Integer listesi

        List<List<String>> stringListeler=new ArrayList<>();
        stringListeler.add(yeniList);
        stringListeler.add(bb);
        System.out.println(stringListeler);
        System.out.println(stringListeler.get(1).size());



        List<List<Object>> objeListeleri=new ArrayList<>();
        objeListeleri.add(new ArrayList<>(aa));//Integer List  --> obje listeleri barindiran bir listeye Integer liste ekledik
        objeListeleri.add(new ArrayList<>(bb));//String List-->obje listeleri barindiran bir listeye String liste ekledik
        objeListeleri.add(new ArrayList<>(yeniList));//Object List-->obje listeleri barindiran bir listeye Object liste ekledik
        System.out.println("objeListeleri = " + objeListeleri);
        System.out.println(objeListeleri.size());
        System.out.println(objeListeleri.get(2).size());











//        bb.addAll(new ArrayList<>(){{
//            add("Ahmet");
//            add("Mehmet");
//            add("Samet");
//
//        };


        }
}
