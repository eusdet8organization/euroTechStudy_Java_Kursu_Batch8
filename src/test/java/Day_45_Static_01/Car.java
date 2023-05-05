package Day_45_Static_01;

public class Car {
    static String name;
    int door=2;//Default yani int old, icin 0`dir


    public static void run(){

        name="Ismail";
        System.out.println("Car is running");
    }

    public int getDoorNumber(){
        name="Bilal";

        int a;
        return door+4;
    }




}

class CarTest{
    public static void main(String[] args) {
        Car c=new Car();
        c.run();
        Car.run();

        System.out.println( c.getDoorNumber() + 2);




        int a=5;
        do {

            a++;

        }while (a<10);

    }

}
