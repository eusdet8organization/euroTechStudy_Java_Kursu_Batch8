package Day_39_ConstructorAndOOPintro.Constructor3;

public class Bankalar {
    public static void main(String[] args) {

        Banka banka1=new Banka("YapiKredi",12100,1903,200,"suleyman");
        System.out.println(banka1.toString());

        Banka banka2=new Banka("isBank",1324,1901,150,"hasanHuseyin");
        System.out.println(banka2.toString());

    }
}
