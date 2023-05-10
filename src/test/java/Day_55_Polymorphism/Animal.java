package Day_55_Polymorphism;

public  class Animal {
    public void sound(){
        System.out.println("Animals make a sound");//hayvanlar ses cikartir
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog says: Haw Haw");//hayvanlar ses cikartir
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat says: miyaw miyaw ");//hayvanlar ses cikartir
    }
}

class Duck extends Animal{
    public void sound(){
        System.out.println("Dog says: vac vac");//hayvanlar ses cikartir
    }
}

class PolymorphismExample{
    public static void main(String[] args) {

        //Object creation non-polymorphism way

        Animal a=new Animal();
        a.sound();

        Dog d=new Dog();
        d.sound();

        Cat c=new Cat();
        c.sound();

        Duck du=new Duck();
        du.sound();

        System.out.println("---------------------------");

        //Object creation with polymorphism way
        Animal animal=new Animal(); //Parent class veya referans class, obje
//                                    create edilme imkani olmayan sinif olarak da kullanilabilir
                                    //for instance-->  ABSTRACTION
        animal.sound();

        Animal dog=new Dog();
        dog.sound();

        Animal cat=new Cat();
        cat.sound();

        Animal duck=new Duck();
        duck.sound();


        System.out.println("--------------------------");
        animal=new Dog();
        animal.sound();

        animal=new Cat();
        animal.sound();

        animal=new Duck();
        animal.sound();


        animal=new Dog();
        animal.sound();








    }
}
