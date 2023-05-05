package Day_49_inheritance_2.Homework_1;

public class Calisan extends Kisi{
    double maas;

    public Calisan(String name, String adres, Okul okul,  double maas) {
        super(name, adres, okul, UyeTipi.CALISAN);
        this.maas=maas;//Bu bizim calisan class field oldugu icin this ile tanimladik, AMA parametreye EKLENMELI
    }

   @Override
    public  String toString(){
        return super.toString()+" "+maas;
    }

}
