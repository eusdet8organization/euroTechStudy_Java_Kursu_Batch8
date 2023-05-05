package Day_45_Static_01;

public class CountableTest {

    public static void main(String[] args) {
        int counter;


        Countable c=new Countable();
        System.out.println( c.getInstanceCount());
        //Expected result
        Countable c1=new Countable();
        Countable c2=new Countable();
        Countable c3=new Countable();
        System.out.println(c3.getInstanceCount());
        System.out.println(c3.getInstanceCount1());


    }
}
