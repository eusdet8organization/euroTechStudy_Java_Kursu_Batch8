package Day_44_Encapsulation_2;

public class JobTest {
    public static void main(String[] args) {

      //  name(); Bir method cagirdik.


        //Bir obje create ettik
        Job employee=new Job();

        System.out.println("employee = " + employee);


        String name="Bilal";


        double result=employee.getSalary();

        System.out.println(result);


        //parametreli bir obje create etme
        Job employee1=new Job("SDET","euroTech",1500);
        System.out.println("Set olmadan employee1 = " + employee1);

    }
















    
    //Bir without return method
    public static void name(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            
        }
    }
}
