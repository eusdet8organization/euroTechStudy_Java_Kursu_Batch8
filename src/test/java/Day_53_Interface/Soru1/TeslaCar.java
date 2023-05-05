package Day_53_Interface.Soru1;
//imlements keyword ile birden fazla interface class a eklenebilir
//Yada interface ler kendi arasinda extend edilip, imlement ile eklenebilir
public class TeslaCar extends Vehicle implements IElectric, IVehicle{
    //Abstract clas ile ilgili degil, constructor ile ilgili
    TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String chanceBatary() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
