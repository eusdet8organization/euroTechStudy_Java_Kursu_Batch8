package Day_48_inheritance_012.SuperVariable;

public class Car extends Vehicle {
    int maxSpeed=180;
    String name="";

    public void display(){
        System.out.println("maximum hiz : "+maxSpeed);
        System.out.println("maximum hiz : "+super.maxSpeed);
    }
}
