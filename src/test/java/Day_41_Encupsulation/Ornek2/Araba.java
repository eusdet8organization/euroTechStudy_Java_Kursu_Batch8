package Day_41_Encupsulation.Ornek2;

public class Araba {
   private String renk;
   private String model;
   private int motor;
   private double fiyat;


    public Araba() {
    }

    //Constructor SET mothodlari ile calisiyor.
    public Araba(String renk, String model, int motor, double fiyat) {
       this.setRenk(renk); //this.renk = renk;
       this.setModel(model); // this.model = model;
       this.setMotor(motor);// this.motor = motor;
       this.setFiyat(fiyat);// this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    private void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor>1300)
        this.motor = motor;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", fiyat=" + fiyat +
                '}';
    }
}
