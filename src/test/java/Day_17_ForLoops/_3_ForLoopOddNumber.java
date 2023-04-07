package Day_17_ForLoops;

public class _3_ForLoopOddNumber {
    public static void main(String[] args) {
        // 5 ten 240 a kadar olan tek sayilari yazdiriniz

        for (int i=5; i<=140; i++){

            if (i%2!=0){  // sayinin 2 ye bolumunden kalan sifir DEGIL ise  ayrica (i%2==1) yazilabilir
                System.out.print(i+" ");
            }

        }


    }
}
