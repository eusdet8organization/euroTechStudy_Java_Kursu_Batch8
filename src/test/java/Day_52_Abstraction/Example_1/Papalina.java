package Day_52_Abstraction.Example_1;

public class Papalina extends Fish {

    @Override
    void eat() {

    }

    @Override
    String ses() {
        return "Duyulmayan bir ses cikariyor";
    }

    @Override
    void yasamYeri() {

        System.out.println("Tatli ve tuzlu suda yasarlar");
    }

    public static void main(String[] args) {

        Papalina balik1=new Papalina();
        balik1.name="Buyuk Papalina";
        balik1.toplama("Buyuk","Papalina");//Abstract olmayan method objeyi tanimliyor
                                 //Burada obyeji modify etmede kullandik

        balik1.ses();//Burada abstract methodu herhangi birsey yazmadan cagiriyoruz.
        System.out.println(balik1.ses());//return type oldugu icin
       // System.out.println(balik1.yasamYeri());//void oldugu icin
    }
}
