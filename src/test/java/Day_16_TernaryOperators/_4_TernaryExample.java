package Day_16_TernaryOperators;

public class _4_TernaryExample {
    public static void main(String[] args) {

        int x=4;
       // Klasik Yontem
        if (x>2){
            if (x<5){
                x=10;
                System.out.println("x = " + x);
            }else
            {
                x=7;
                System.out.println("x = " + x);
            }
        }else
        {
            x=5;
            System.out.println("x = " + x);
        }

        //Ternary Yontemi ile
        System.out.println(x>2 ? x<5 ? 10 : 7 : 5);
        // Ternary operatorde sirayla okudugu icin parantez olmazsa bile ic ice olan ifelse eri dogru okur.
        //ilk soru isareti ile ifade edilen Ternary expression a karsilik son iki nokta ilkin else sini yi ifade eder.

    }
}
