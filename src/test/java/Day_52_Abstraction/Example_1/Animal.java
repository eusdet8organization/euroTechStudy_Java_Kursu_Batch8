package Day_52_Abstraction.Example_1;

public abstract class Animal {
    //instance variable
    protected String name;
    private static int age;

    //abstact method lar override edilmek ZORUNDA (child class larda)
    abstract void eat();//Bu sekilde bir abstract method yazdik

    abstract String ses();//abstract method

    //CONCRETE --> Soyut olmayan method--OVERRIDE EDILMEK ZORUNDA DEGIL
    public void toplama(String ad, String soyad){
        String fullName=ad+soyad;
    }

    //Constructor in Abstract class
    Animal(){//Default constructor

    }
    Animal(int age){//Default constructor
        this.age=age;

    }

    //instance block
    {
        System.out.println("bu bir instance block");
    }

    static
    {
        System.out.println("Static block yazdik");
    }

    private void sleep(){
        System.out.println("Animals are sleeping");
    }


}
