package Day_19_WhileDoWhile;

public class _5_WhileDoWhileForExercises {
    public static void main(String[] args) {

//        int sum=0;
//
//        for (int i = 0; i <= 4; i++) {
//
//           // System.out.println("i = " + i);
//            if (i%3==0) // if sonrasinda TEK satirlik bir islem icin zorunlu degil, sadece ilk satiri sarti algilar.
//                continue;
//
//            sum+=i; // sum=sum+i;
//
//            System.out.println("i = " + i);
//        }

        //OUTPUT kisminda :Process finished with exit code 0 gordugunuzde CODE BASARILI calisti demektir.


        int sum=0; int i=0;

        while (i<4) {   // Sonucu ? SONSUZ dongu

            if (i%3==0)      // Bu sonsuz dongunun sebebi  0/3=0 oldugundan, artis veya azalis islemi gerceklesemiyor
                continue;  // Bir dongude kendisinden sonra gelen kod blogunu veya statement ATLAR, okumaz

            sum+=i;

            i++;  // artis verilmis
        }
    }
}
