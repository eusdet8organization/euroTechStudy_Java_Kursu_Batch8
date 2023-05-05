package Day_51_FinalKeyword;

public class TestParentChild {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.azalis();//expected result:32
        System.out.println(p1.age);//33
        System.out.println("p1.name = " + p1.name);
        //expected result : RamazanBey
        p1.azalis(); //31
        System.out.println(p1.exchanceRate);
        //19.45


        Child c1=new Child();
        System.out.println(c1.age);//33
        System.out.println(p1.age);//31
        c1.azalis(); //32
//        System.out.println(super.exchance);//17.45
        System.out.println(c1.name);//SelimBey
    }
}
