package Day_56_Polymorphism_2.Example;

public class Ogrenci extends Kisi{
    private String sube;

    public Ogrenci(String name, String soyad, String gorev, String sube) {
        super(name, soyad, gorev);
        this.sube=sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
