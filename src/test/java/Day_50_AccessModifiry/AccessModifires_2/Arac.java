package Day_50_AccessModifiry.AccessModifires_2;

public class Arac {
    String model;
    public static int year;
    private String color;
    private int door;
    protected double engine;

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

}
