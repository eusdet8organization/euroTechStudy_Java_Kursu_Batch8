package Day_56_Polymorphism_2;

import java.util.ArrayList;
import java.util.List;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shape=new Shape[3];//Bir sekil objelerini iicerecek array olusturdum
        shape[0]=new Cricle();//Sekil dizinin ilk elementine Daire objesi create ettim
        shape[1]=new Triangle();
        shape[2]=new Square();

        shape[0].draw();//Burada Sekil dizisinin ilk elementinin (Yani daire objesinin)
                         //draw methodunu cagirdik

        for (Shape sh : shape) {//foreach ile diziyi yazdirmak istedik
            //System.out.println(sh.getClass());//class information getirir (OBJECT class indan)
           // System.out.println(sh.getClass().getName());
            System.out.println(sh.getClass().getSimpleName());

        }
        System.out.println("*************************************");


        //List ile Arraylist arasindaki Polymorphism var.
        List<Shape> shapeList=new ArrayList<>();//Bu List adindaki Interface classinin
                                              // Child class larindan Arraylist kullandik

        shapeList.add(new Cricle());//Burada bir daire objesi olusturup ekledim
        shapeList.add(new Triangle());
        shapeList.add(new Square());

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shapeList.get(i).getClass().getSimpleName());
        }

    }
}
