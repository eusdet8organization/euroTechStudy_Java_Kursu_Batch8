package Day_56_Polymorphism_2.Example;

public class Calisan extends Kisi{
    private String departman;
    public Calisan(String name, String soyad, String gorev, String deparman) {
        super(name, soyad, gorev);
        this.departman=deparman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
