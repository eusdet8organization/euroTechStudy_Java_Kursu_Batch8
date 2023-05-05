package Day_44_Encapsulation_2;

public class Employee {
   private String name;
   private int idNumber;
   private String departmant;
   private String position;

    public Employee(String name, int idNumber, String departmant, String position) {
        this.setName(name);
        this.setIdNumber(idNumber);
        this.setDepartmant(departmant);
        this.setPosition(position);


      //  this(name,idNumber,departmant,position);
    }
    public Employee(String name, int idNumber, String departmant) {

          this(name,idNumber,departmant,"");
    }
    public Employee(String name, int idNumber) {

        this(name,idNumber,"","");
    }
    public Employee(String name) {

        this(name,0,"","");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber=idNumber;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", departmant='" + departmant + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
