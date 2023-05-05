package Day_50_AccessModifiry.AccessModifires_3;

import Day_50_AccessModifiry.AccessModifires_2.Arac;//manuel olarak import ettik

public class AracTest {

    public void test4(){

    }


    public static void main(String[] args) {
        Arac arac1=new Arac();

        Arac2 arac2=new Arac2();
        System.out.println("arac2.test3() = " + arac2.test3());
        arac2.year=2013;

    }
}
