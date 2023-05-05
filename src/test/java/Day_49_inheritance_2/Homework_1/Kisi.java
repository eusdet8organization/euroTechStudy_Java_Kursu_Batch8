package Day_49_inheritance_2.Homework_1;

public class Kisi {
    String name;
    String adres;
    Okul okul;
    UyeTipi uyeTip;

    public Kisi(String name, String adres, Okul okul, UyeTipi uyeTip) {
        this.name = name;
        this.adres = adres;
        this.okul = okul;
        this.uyeTip = uyeTip;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                ", okul=" + okul +
                ", uyeTip=" + uyeTip +
                '}';
    }
}
