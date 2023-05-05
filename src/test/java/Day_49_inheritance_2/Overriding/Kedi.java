package Day_49_inheritance_2.Overriding;

public class Kedi extends Animal{
    @Override
    public String cikarilanSes(String b, int trs){
        return "Kedi miyav miyav dedi";
    }

    @Override
    public void eat(){
        System.out.println("Kedi sut icer");
    }

}
