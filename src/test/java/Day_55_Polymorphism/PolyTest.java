package Day_55_Polymorphism;

public class PolyTest {
    public static void main(String[] args) {
        //Burada sadece Poly2 ye gider.
        Poly2 obje=new Poly2("ismet");//Obje create edildi
        //Burada Poly2 deki constructer calisir


        //Burada ilk parent, eger override varsa, child classina gider.
        Poly obje1=new Poly2("ejder");//Obje creae ettik with Polymorphism
        //Parent (Poly) class daki constructor calisir
    }
}
