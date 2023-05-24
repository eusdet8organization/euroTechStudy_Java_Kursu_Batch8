package Day_63_Review_01;

public class Main {
    public static void main(String[] args) {

        Employee employee= new Employee
           ("Ayse",30,'F',"Senior QA",0071,4500,"IT");
        System.out.println("Yasiniz = "+employee.getAge());//Bu sadece yasini yazdirmak icin
        System.out.println("Calisma Deparmaniniz = "+employee.deparmant);

    }
}
