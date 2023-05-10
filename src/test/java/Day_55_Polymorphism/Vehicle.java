package Day_55_Polymorphism;

public class Vehicle {
    String name;
    double price;

    public void motorHacmi(){
        System.out.println("Aracin agirligina gore belirlenmelidir");
    }
}

class Truck extends Vehicle{
    public void motorHacmi(){
        System.out.println("En az 2000 motor olmalidir");
    }
}

class Car extends Vehicle{
    public void motorHacmi(){
        System.out.println("En az 1000 motor olmalidir.");
    }
}

class VehicleTest{
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.motorHacmi();

        car=new Truck();
        car.motorHacmi();


    }
}
