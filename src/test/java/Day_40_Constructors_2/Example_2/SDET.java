package Day_40_Constructors_2.Example_2;

import java.util.ArrayList;

public class SDET {

    String name;
    int age;
    char gender;
    String company;
    double salary;


    public SDET(String name, int age, char gender, String company, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }


//    public String toString(){
//        return name+" "+age+" "+gender+" "+company+" "+salary;
//    }






    

//    public static void main(String[] args) {
////        int sayi=12;
////        System.out.println("sayi = " + sayi); //print edilen her sey String olarak cevrilip yazdirilir.
////
////        ArrayList<Integer> sayilar=new ArrayList<>();
////
////        sayilar.add(24);
////        sayilar.add(34);
////        sayilar.add(12);
////        System.out.println("sayilar = " + sayilar);//toString ile yazdiriliyor
//
//
//        SDET yeniPersonel=new SDET("Bayram",12,'M',"euroTech",120000);
//        System.out.println("yeniPersonel.toString() = " + yeniPersonel.toString());
//
//
//
//
//    }
 
    




}
