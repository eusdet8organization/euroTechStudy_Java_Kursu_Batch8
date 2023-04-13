package Day_41_Encupsulation.Ornek2;

public class arabaMain {
    public static void main(String[] args) {
       Araba araba=new Araba("Pembe","Mazda",
               1200,570.58);
        System.out.println("araba = " + araba);


        Araba araba1=new Araba();
        araba1.setMotor(1500);
        System.out.println("araba = " + araba1);

    }
}
