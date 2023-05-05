package Day_52_Abstraction.Example_1;

public class Hamsi extends Papalina {
    //Burada normal olan bir classi extend ettik. Bu extednd edilen Papalina classi, Parent ve Grand Parent
    // abstract class lari extend eden bir class
    //Ama override veya baska bir zorunluluk olusturmadi

//Manuel olarak abstract methodlarini override ettik.
    @Override
    void eat() {
        System.out.println("Hayvanlar tekitim yaparak buyurler");
    }
    @Override
    String ses() {
        return "Sesi duyulmuyor";
    }
    @Override
    void yasamYeri() {
        System.out.println("Tuzlu suda yasarlar");
    }

    public static void main(String[] args) {
        Hamsi h1=new Hamsi();
        h1.eat();
        h1.yasamYeri();
        System.out.println(h1.ses());
    }
}
