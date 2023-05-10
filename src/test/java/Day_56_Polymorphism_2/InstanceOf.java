package Day_56_Polymorphism_2;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape=new Shape();//Polymorphic olarak obje create ettim
        shape=new Square();

        if (shape instanceof Square){//Bu sekil KARE sinifi mi  ait(boolean expression)
            System.out.println("Shape belong to Square Class");//Bu sekil KARE sinifi  aittir
        }else if (shape instanceof Cricle){
            System.out.println("Shape belong to Cricle Class");//Bu sekil DAIRE sinifi  aittir
        }else if (shape instanceof Triangle){
            System.out.println("Shape belong to Triangle Class");//Bu sekil UCGEN sinifi  aittir
        }

    }
}
