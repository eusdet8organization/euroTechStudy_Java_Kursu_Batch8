package Day_49_inheritance_2.Homework_1;

public class Ogrenci extends Kisi{
    double ucret;

    public Ogrenci(String name, String adres, Okul okul, double ucret) {
        super(name, adres, okul, UyeTipi.OGRENCI);
        this.ucret=ucret;
    }

    @Override
    public String toString(){
        return super.toString()+" "+ucret;
    }

//    @Override
//    public String toString() {
//        return "Ogrenci{" +
//                "ucret=" + ucret +
//                ", name='" + name + '\'' +
//                ", adres='" + adres + '\'' +
//                ", okul=" + okul +
//                ", uyeTip=" + uyeTip +
//                '}';
//    }
}
