package Day_44_Encapsulation_2;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        //Burada bir string eleman ekledik arraylist e
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Ramazan");

        //Burada bir int eleman ekledik arraylist e
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);


        ArrayList<Employee> calisanlar=new ArrayList<>();
        Employee calisan = new Employee("Gulden");
        calisanlar.add(calisan);
        calisanlar.add(new Employee("Bilal"));
        calisanlar.add(new Employee("Ayse",12345));
        calisanlar.add(new Employee("Symbat",123,"IT"));
        calisanlar.add(new Employee("Selim",123456,"QA","Senior"));
        System.out.println("calisanlar = " + calisanlar);


        //  Employee calisan = new Employee("Gulden");



    }
}
