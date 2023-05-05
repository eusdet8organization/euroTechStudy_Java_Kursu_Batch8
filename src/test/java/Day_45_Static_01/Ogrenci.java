package Day_45_Static_01;

public class Ogrenci {
    String name,surName;
    static String okulAdi="Yildirim Lisesi";

    public Ogrenci(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
