package Day_56_Polymorphism_2;

import Day_55_Polymorphism.Animal;

public class DownCasting {
    public static void main(String[] args) {
       Animal1 animal1=new Dog1();//Polymorphic yapu
       animal1.sound();//SADECE PARENT CLASS indaki metholari calistirir

     //   Dog1 dog1=animal1; //Burada Parent refere edilerek olusan obje Bir sub class objesi DEGILDIR

        //SUB CLASS OBJESI HALINE GETIREBILIRIZ
        // Dog1 dog1=new Dog1(); bu sekilde yazilabilir AMA  DOWNCAST ile direct olarak yazabiliriz
        Dog1 dog1= (Dog1) animal1; //--> SUB class objesine dondurduk
        dog1.eat("ETCIL oldugu icin ");
        dog1.sound();


       // Dog1 dog1=(Dog1) animal1;//Animal objesi Dog objesine Down Casting ile DOG objesi haline getirdik,

    }
}

class Animal1{
    public void sound(){
        System.out.println("Hayvanlar ses cikarir");
    }
}

class Dog1 extends Animal1{
    public void sound(){
        System.out.println("Kopekler hav hav der");
    }

    public void eat(String s){
        System.out.println(s+ " et urunu ise yerler");
    }
}

class Cat extends Animal1{
    public void hareket(){
        System.out.println("Kediler dort ayakla yururler");
    }
}