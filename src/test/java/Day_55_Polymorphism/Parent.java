package Day_55_Polymorphism;

public class Parent {
    public void Print(){
        System.out.println("Super class Print edildi");
    }
}

class Subclass1 extends Parent{
    public void Print(){
        System.out.println("Subclass1 Print edildi");
    }
}

class Subclass2 extends Parent{
    public void Print(){
        int abc=231;
        double abcd=23.1;
        System.out.println("Subclass2 Print edildi");
    }


}

class RuntimePoly{
    public static void main(String[] args) {

        Parent parent=new Parent();
        parent.Print();

        Subclass1 subclass1=new Subclass1();
        subclass1.Print();

        Subclass2 subclass2=new Subclass2();
        subclass2.Print();


    }
}