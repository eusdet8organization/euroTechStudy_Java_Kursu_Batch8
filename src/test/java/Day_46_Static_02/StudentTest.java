package Day_46_Static_02;

public class StudentTest {
    public static void main(String[] args) {

        Student student1=new Student();
               student1= new Student("Fatma",23,1234);
        Student student2=new Student();
        Student student=new Student("Esref",21,1235);

        System.out.println(student1.toString());
        System.out.println(student1);
        System.out.println(student);
        System.out.println(student2);

        student1.school="euroTechSDET";

        System.out.println(student1.toString());
        System.out.println(student1);
        System.out.println(student);
        System.out.println(student2);

    }
}
