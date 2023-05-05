package Day_49_inheritance_2.Overriding_Example2;

public class Car extends Vehicle{
    String renk;
    @Override
    void yakit(double speed, double motorGucu){
        yakitMiktari+=speed+(motorGucu*0.75);
        System.out.println(yakitMiktari);
    }
}
