package Day_46_Static_02;

public class Student {
    String name;
    int age;
    int idNumber;
    static String school="euroTech";
   private static int ID=1;

    Student(){

    }

    public Student(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public void m2(){
      //  static String ac="";  LOCAL variable STATIC OLAMAZ!!!
        school="";
        age=1;
        name="";
    }


    public static void m1(){
     //   static int a=4;//Static olarak LOCAL variable OLMAZ!!!
//        m2();     Static bir method icerisine static olmayan variable veya method
//        age=2;     direct cagrilamaz
//        name="";
        school="";
        Student s1=new Student("Jhon",12,123);
        System.out.println("s1.age = " + s1.age);
        System.out.println("s1.name = " + s1.name);

        //onceden create edilen bir objeye farkli degerler atadik
        s1=new Student("Ismail",25,321);

    }

    public static void setID() {
        Student.ID++;
    }

    @Override
    public String toString(){
       return "Student [name="+name +", age="+age+", idNumber="+idNumber+", school="+school+" ]";
    }
}
