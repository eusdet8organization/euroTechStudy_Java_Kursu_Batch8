package Day_40_Constructors_2.Example_1;

import java.util.ArrayList;

public class School {

    public static void main(String[] args) {

        //ikinci bir yontem ile ogrenci create ettik.
        Student ogr3=Student.createStudent();
        System.out.println("Method cagrilarak ogrenci kaydi   "+ogr3.ogrName);

        Student ogr4=new Student();
        ogr4.ogrName="Bilal";
        System.out.println("Constructor ile ogrenci kaydi   " + ogr4.ogrName);


        //ucuncu bir yontem ile ogrenci create ettik
        Student ogr5=new Student(123,"Ahmet1","Bayram",5,true);
        System.out.println("Parametreli olan constructor cagirdik : " + ogr5.ogrName);



        //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-1
        Student ogr6=new Student(123,"Ahmet1","Bayram",5);
        System.out.println(ogr6.ogrLevel);

         //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-2
        Student ogr7=new Student(123,"Ahmet1","Bayram");
        System.out.println(ogr7.ogrName);

        //Bazi parametreler belli degil ise nasil kaydetme yapacagiz-3
        Student ogr8=new Student(123);
        System.out.println(ogr8.ogrName);
    }








}
