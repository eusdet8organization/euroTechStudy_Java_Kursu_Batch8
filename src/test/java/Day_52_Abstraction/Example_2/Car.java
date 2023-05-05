package Day_52_Abstraction.Example_2;

public abstract class Car {
    protected String name;
    protected static int  age;
    private double motorGucu;

     abstract void yakit();

    protected abstract int tekerSayisi();


    //Constructer
    Car(int motorGucu){
        this.motorGucu=motorGucu;
    }


}
