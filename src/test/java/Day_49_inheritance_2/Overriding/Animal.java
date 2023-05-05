package Day_49_inheritance_2.Overriding;

public class Animal {
    static String eat="Beif";
    public String cikarilanSes(String ab, int abc){
        return "Hayvan ses cikardi";
    }
    public void eat(){
        System.out.println("Hayvanlar tuketir");
    }
}


//Bir method overriding olarak yazildiginda STATIC
//OLAMAZ. Cunku tek deger alir.