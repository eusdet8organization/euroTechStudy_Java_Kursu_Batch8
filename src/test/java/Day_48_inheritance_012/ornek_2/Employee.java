package Day_48_inheritance_012.ornek_2;

public class Employee extends Person{
    String jobTitle;

    public void work(){
        System.out.println(name+" is working as "+jobTitle);
        //Bilal bey QA olarak calismaktadir.
    }

    @Override
    public String toString() {
        return "Employee [ jobTitle= " + jobTitle  + ", name='" + name  + ", age=" + age + ", gender=" + gender +  ']';
    }

}
