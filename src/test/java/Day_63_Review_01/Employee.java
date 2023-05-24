package Day_63_Review_01;

public class Employee extends Person{
    private String jobTitle;
    private double salary;
    private int emplyeeID;
    public String deparmant;



    //Bu hali ile sadece Person classinin obje kriterlerini tanimlamis olduk
    public Employee(String name, int age, char gender,String jobTitle,
                    int employyeID, double salary, String department){
        super(name, age, gender);
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
        this.setEmplyeeID(employyeID);
       this.deparmant=department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try {
            this.salary=salary;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public int getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(int emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", emplyeeID=" + emplyeeID +
                ", deparmant='" + deparmant + '\'' +
                '}';
    }
}
