package Day_52_Abstraction.Example_3;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen(6,4);
        dikdortgen.setName("Dikdortgen");
        System.out.println("dikdortgen = " + dikdortgen);


        Cember cember=new Cember(2.5);
        cember.setName("Cember");
        System.out.println("cember = " + cember);

        dikdortgen.ciz();
        cember.ciz();
    }
}
