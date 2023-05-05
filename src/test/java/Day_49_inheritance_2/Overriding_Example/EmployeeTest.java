package Day_49_inheritance_2.Overriding_Example;

public class EmployeeTest extends Employee{
    @Override
    void geliriHesapla(int saat, double saatUcreti){
        System.out.println("Toplam net gelir :"+(saat*saatUcreti*0.95));
    }
}
