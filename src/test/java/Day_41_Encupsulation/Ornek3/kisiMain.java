package Day_41_Encupsulation.Ornek3;

public class kisiMain {
    public static void main(String[] args) {

        Kisi k1=new Kisi("RamazanBey");
        System.out.println("k1.getYas() = " + k1.getYas());

        k1.setYas(-12);
        System.out.println(k1);


        Kisi k2=new Kisi("GuldenHanim");
        System.out.println(k2);

    }
}
