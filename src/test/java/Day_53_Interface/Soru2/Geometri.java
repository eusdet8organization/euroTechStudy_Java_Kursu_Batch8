package Day_53_Interface.Soru2;

public class Geometri {
    public static void main(String[] args) {
        Cember cember1=new Cember();
        System.out.println("cember1.alan(4) = " + cember1.alan(4));
        System.out.println("cember1.cevresi(4) = " + cember1.cevresi(4));

        Kare kare1=new Kare();
        System.out.println("kare1.alan(4) = " + kare1.alan(4));
        System.out.println("kare1.cevresi(4) = " + kare1.cevresi(4));

        Dikdortgen dikdortgen1=new Dikdortgen();
        System.out.println("dikdortgen1.alan(4,5) = " + dikdortgen1.alan(4, 5));
        System.out.println("dikdortgen1.cevresi(4,5) = " + dikdortgen1.cevresi(4, 5));
    }
}
