package Day_19_WhileDoWhile;

public class _2_While {
    public static void main(String[] args) {
        int x=1;
        //x++;  //x=2

        //SARTIN icerisinde counter(x artis veya azalisi) oldugu icin TEK bir kez dondu.
        while ((++x)%2==0){ // SART her daim FALSE  , Noktalivirgul veya System.out.println olmadigi surece
         // x=2           // ++ veya -- SONRASINDA ise CALISMAZ. ONCESINDE islemi yapar ve sonra matematik
                          // islem onceligine gore hareket eder.
           // System.out.println("Hello Java");
            System.out.println("x = " + x); // x=2 --> cikti

            //Statement veya code body veya kod blogu while sarti TRUE oldugunda calisir.

        }
    }
}
