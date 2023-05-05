package Day_44_Encapsulation_2;

public class Job {
    private String title;
    private String company;
    private double salary;

    //DEFAULT constructor
    public Job(){
       // System.out.println("Obje olustu");
    }

    public Job(String title, String company, double salary){
        //WRITE oldugunu parametre atanmasindan dolayi
        this.setSalary(salary);// this.title=title;// this.setSalary(salary); //this.title=title;
        this.setTitle(title);//this.company=company;
        this.setCompany(company);//this.salary=salary;

    }




    public  Job(int age){
        this();
        System.out.println(age);
    }

    public Job(int age, int score){
        this(15);
        System.out.println(age*score);
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    //READ-->Cagirip kullanabilirsiniz
    public String getTitle(){
       return title;
    }

    //WRITE-->Deger atayabilir ve sartlar belirleyebilirsiniz
    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary(){
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        if (salary>1800) {
            this.salary = salary;
        }
    }
}
