package Day_52_Abstraction.Example_3;

public class Cember extends Sekil{
    double yariCap;

    Cember(double yariCap){
        this.yariCap=yariCap;
    }
    @Override
    double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    double cevre() {
        return Math.PI*2*yariCap;
    }
}
