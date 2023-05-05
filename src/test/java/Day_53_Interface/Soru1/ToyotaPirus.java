package Day_53_Interface.Soru1;

public class ToyotaPirus extends Vehicle implements IGas,IElectric {
    ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String chanceBatary() {
        return null;
    }

    @Override
    public String chanceOil() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }
}
