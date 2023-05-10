package Day_56_Polymorphism_2;

public class Animal {
    public void sound(){
        System.out.println("Hayvan ses cikarir");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Kopek hav hav dedi");
    }
    public void eat(String s){

    }
}
class AnimalTest{
    public static void main(String[] args) {
        Animal animal1=new Dog();
        animal1.sound();
       // animal1.eat();//Bu method cagrilamama sebebi SADECE Child class a ait olmasindan kaynaklidir
        // child class daki SADECE override edilmis method lar Parent class refere edilerek olusmus objelerde kullanilabilir

    }
}
