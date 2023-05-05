package Day_50_AccessModifiry.AccessModifires_2;

import Day_50_AccessModifiry.AccessModifires_1.A3;//PUBLIC olan Constructor icin
import Day_50_AccessModifiry.AccessModifires_1.A4;
//Baska bir paketteki bir class dan obje create etmek icin paketin o classini import ettik.

public class A5 extends A4{
    public static void main(String[] args) {
       // A3 obje3=new A3();
        //obje3.name="isim"; //DEFAULT degerli bir variable default access modifire ise, baska bir paket den ERISILEMEZ!!

        A4 obje4=new A4();
        obje4.school="";
        obje4.test4();



    }
}
