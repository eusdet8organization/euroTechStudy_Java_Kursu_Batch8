package Day_28_CollectionAndRandom;

import java.util.Random;

public class _8_Math {
    public static void main(String[] args) {
        //Math class icerisinde bircok static method yer almaktadir. Cok kullanisli olanlari genellikle kullanmak gerekir
        System.out.println( Math.max(7,5));
        System.out.println(Math.min(3,5));

        System.out.println(Math.PI);

        System.out.println(Math.E);

        //Double degerlerinin min ve max olanini alma method unu cagirdik Math class indan
        System.out.println(Math.min(2.7, 8.1231));
        System.out.println(Math.max(4.6, 8.1231));

        System.out.println(Math.pow(4,3));

        System.out.println(Math.floor(-2.3)); //expected result-3 // floor--> zemin veya taban demek
        System.out.println(Math.ceil(3.1)); //expected result-> 4 //ceil -->tavan veya ust demek

        //Bu Math class i icerisinde bir random
        Math.random(); //STATIC ise direct olarak class ismi ile cagirabiliriz. Method veya degisken olmasi farketmez


        //Bu ise Random class i ifade eder. Bu class dan bir nesne olusturduk
        Random r=new Random();

        //Random icin ikisini de kullanabilirsiniz.

        //Onemli, herkesin bu kutuphaneyi ornekler cozerek calisip arastirmasini rica ediyorum.
        //TODO : regex kutuphanesinde tanimli  !!!!!

    }
}
