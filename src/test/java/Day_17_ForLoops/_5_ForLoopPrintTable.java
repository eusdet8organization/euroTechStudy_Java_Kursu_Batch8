package Day_17_ForLoops;

public class _5_ForLoopPrintTable {
    public static void main(String[] args) {
        //   Number      NumberSquared
        //   1              1
        //   2              4
        //   3              9

        // 1 den 10 kadar sayilari yazdiriniz.

        System.out.println(" Number        NumberSquared");//For dongusu oncesinde listenin ust tarafinda tanim icin adlandirdik
        System.out.println(" ------        -------------"); //onemli seylerin altini ciziyoruz

        for (int num=1; num<=10; num++){

            System.out.println("  "+ num +"\t\t\t\t   "+ num*num);
            //Burada sayinin kendisi ve arada bosluk olusturup sonrasinda sayinin karesini yazdirdik
        }

    }
}
