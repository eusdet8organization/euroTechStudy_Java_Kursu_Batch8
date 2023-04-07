package Day_25_ObjectAndClass;

public class Employee {
   String name;
    String jobTitle;
    double salary;
     int workHours;

    public void wor(){
        //Nesne olusturmak icin MAIN zorunlu degildir.
        Employee employee=new Employee();

        //instance variable direckt olarak kullandik -- > Value=Default = null
        System.out.println(name + " is work very hard..");
    }

    public void introduce(){
        System.out.println("Employee`s name :"+name+"\n Job Title : "+jobTitle+ "\n Salary : "
                +salary+"\n Work Hours : "+workHours);
    }

}

class objectEmployee{
    public static void main(String[] args) {

        Employee employee=new Employee();//Burada bir nesne olusturduk

        employee.introduce();
        System.out.println();

        //Degiskenlere deger atadimz
        employee.workHours=8;
        employee.name="Ayse";
        employee.salary=5630.345;
        employee.jobTitle="Senior QA";

        //Method cagirdim
        employee.introduce();

    }
}
