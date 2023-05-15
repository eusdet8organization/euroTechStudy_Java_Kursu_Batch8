package Day_59_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _02_Collection_EqualArray {
    public static void main(String[] args) {
        //Verilen iki listenin esit olup olmadigini tartisiniz

        String[] sehirler=new String[]{"Munih","Dortmunt", "Berlin","Hamburg"};


        String[] kulupler=new String[]{"Bayer Munih", "Borrussia Dortmunt", "Herta Berlin", "Fc Hamburg"};

      ////////////////////////////////////////////////////////////

        //1-Listeler esit mi?  --Boolean expression doner
        Arrays.equals(sehirler,kulupler);  //   ==  burada hem obje hem deger yapisi esit olmali,
                                          // equals ise sadece obje degeri esit olmali
        System.out.println(Arrays.equals(sehirler,kulupler));//FALSE

        /*
        String a="Apple";
        String b="Apple";   burada a==b --> true  --> Burada referans check edilir,
        String c=new String("Apple");   a==c-->False FAKAT, a.equals(c)--> True  -->Degerine bakilip kontrol yapilir
         */

        //2-Listenin degerleri diger liste icerisinde yer aliyor mu?
        String[] klupler1=new String[kulupler.length];
        int i=0;
        for (String s : kulupler) {
            klupler1[i]=  //Burada ise yeni olusturulan array in index verilerek deger atamasi yaptik
                    s.split(" ")[1];//Burada bolunen Stringin olusan elementler icerisinden index atayarak element aldik
            i++;
        }
        System.out.println(Arrays.toString(klupler1));

        Arrays.equals(sehirler,klupler1); //Expected result and Actual result verify ediliyor
        System.out.println(Arrays.equals(sehirler,klupler1));//TRUE


        List<List<String >> listeler=new ArrayList<>();




        ArrayList<String > liste1=new ArrayList<>();
        String aa=new String("Ayse");

        liste1.add(aa);  //Ayni islem --->liste1.add("Ayse");
        liste1.add("Ayse");
        liste1.add("Fatma");
        liste1.add("Asya");


        ArrayList<String > liste2=new ArrayList<>();
        liste2.add("Ahmet");
        liste2.add("Mehmet");
        liste2.add("Atik");

        ArrayList<String > liste3=new ArrayList<>();
        liste3.add("Jhon");
        liste3.add("Samuel");
        liste3.add("Chocs");

        listeler.add(liste1);
        listeler.add(liste2);
        listeler.add(liste3);

        System.out.println("listeler = " + listeler.toString());




        Person person1=new Person("Bilal","QA",32); //Person clas dan bir OBJE
        Person person2=new Person("Ramazan","SDET",34); //Person clas dan bir OBJE
        Person person3=new Person("Ayse","SeniorQA",24); //Person clas dan bir OBJE

        List<Person> personList=new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);

        // personList.add("Gulden","Senior SDET",25);

        List<Object> list=new ArrayList<>();
        Person person5=new Person("aa","bb",12);

        list.add(person5);
        list.add(4);
        list.add("Ahmet");








        list.add(person1);//Bu birer obje ise , Classlarin BABASI olan OBJECT classina ait oluyor
        list.add(person2);
        list.add(person3);
        list.add("Sayfa");
        list.add(5);







        List<List<Object>> objlerinListesi=new ArrayList<>();



    }
}

class Person{
    String name;
    String job;
    int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
