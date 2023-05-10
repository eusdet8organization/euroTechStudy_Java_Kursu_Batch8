package Day_56_Polymorphism_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();//Buradaki Parent class olan Shape deki draw

        shape=new Cricle();
        shape.draw();//child class olan Cricle deki draw

        shape=new Triangle();
        shape.draw();//Ucgen olan sub class daki draw

        shape=new Square();
        shape.draw();//Burada sub class olan kare deki draw
    }
}
