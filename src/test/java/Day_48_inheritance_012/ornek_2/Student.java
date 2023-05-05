package Day_48_inheritance_012.ornek_2;

public class Student extends Person {

    int studentId;
    String termClass;
    public void code(String lang){

        System.out.println(name +" is coding "+ lang);
    }


    public void attendClass(){
        System.out.println(name+" is attending "+termClass+" class");
    }
}
