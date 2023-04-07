package Day_25_ObjectAndClass;

public class Dog {
    String breed;
    int age;
    String color;
    String name;


    public void barking(){
        System.out.println(name + " is barking");
    }

    public void hungry(){
        System.out.println(name + " is hungry");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    //Dilerseniz main methodu tanimladik, yani ayni class icerisinde NESNE olusturup kullanabiliriz
//    public static void main(String[] args) {
//        Dog dog1=new Dog();
//
//
//    }

}
