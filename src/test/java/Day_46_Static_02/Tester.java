package Day_46_Static_02;

import java.util.ArrayList;

public class Tester {
    String m="m";//instance variable yani objeye ait variable
    static String deger="d"; //static yani class a ait bir variable
    //static blok
    static {                                    //1-ILK olarak STATIC BLOK calisir
        deger+="s";
        System.out.println("Static blok Tester");
    }
    //static olmayan block
    {                                        //4- Constructor dan once HER ZAMAN calisir. !!! preConstructor
      deger+='o';
    }
    //bir parametresiz constructor olusturduk
    Tester(){                             //5-MAIN de hangi Constructor cagrildiysa static olmayan bloktan sonra calisir
        deger+="t";
        m="m1";
    }
    Tester(String str){//with parameter cons.
        deger+=str;
        m="f";
    }

    public static void main(String[] args) {   //2-IKINCI olarak MAIN methodu calismaya baslar
        System.out.println("main methodu");
        Tester test1 = new Tester();  //3-Obje olusturulurken constructor calismadan STATIC OLMAYAN BLOK CALISIR
        test1 = new Tester("k");
        System.out.println(deger + test1.m);

//        ArrayList<Tester> testers=new ArrayList<>();
//        testers.add(new Tester("Ayse"));
//        testers.add(new Tester());
//
//    }
    }
}
