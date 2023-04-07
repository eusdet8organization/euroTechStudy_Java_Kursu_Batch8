package Day_11_Java_Logical_Operators;

public class _4_LogicOperators {
    public static void main(String[] args) {

        int sayi=30;

        System.out.println(sayi<=50 || sayi==41 && sayi>=45);


        // Islem onceligi

       // Eger VE varsa oncelik onundur. Operatorlerde de parantez ile belirtmediginiz surece
        //DEFAULT olarak oncelikleri yapar. && operatoru || den once gelir.

        System.out.println(sayi<=50 || (sayi==41 && sayi>=45));
        System.out.println(sayi<=50 || false); // VEYA isleminde bir tane TRUE varsa sonuc TRUE

        System.out.println(sayi<=50 || sayi==32);

/*       VE durumunda (&&)
        true && true  -->  true
        true && false --> false
        false && true --> false
        false && false --> false

        && ile belirlenen bir operator islemi varsa, sartlardan biri false ise sonuc FALSE dir.


 */

        /*  VEYA (||)
        Operation Result
          true || true ----> true
          true || false ----> true
          false || true ----> true
          false || false ---> false
         */










        //  ! operatoru

       // GEGILi, olmayani gibi anlamlarda kullanilan operator (!)

        int y;
        y=12;

        System.out.println((y<=20 && y>=4)); // sonuc TRUE, cunku her iki kosul saglanmakta
                                             // burada 12 sayisi 20 den kucuk VE ayni sayi 4 den buyuk


        System.out.println(!(y<=20 && y>=4)); // Question: y sayisi 20 ye esit veya kucuktur. VE
                                              // y sayisi 4 den buyuk veya esit DEGIL MI?

        // SARTIN DEGILI  -- > Tanimlanan sinirlardan hareketle tanimlanamayan kismi ifade etmeye yarar.



    }
}
