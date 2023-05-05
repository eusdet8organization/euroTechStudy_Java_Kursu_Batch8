package Day_45_Static_01;

public class ABC {
//Class properties   --> Sinifa ait degiskenler--> fields, class variable
    static String name; //  class variable
    int age;  //fields




    public static void toplam(){
        //NON static variable olmak zorundadir
        int a=5;//LOCAL variable,
        int b=6;

        System.out.println(a+b);
    }
    public static void m1(){

    }
    public void m2(){

    }


    ABC(){ //Constructor--> Access (erisme) Modefiry yazilmadan DEFAULT constructor yazdik

    }
}
