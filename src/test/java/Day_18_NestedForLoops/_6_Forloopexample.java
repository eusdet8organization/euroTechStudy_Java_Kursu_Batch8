package Day_18_NestedForLoops;

public class _6_Forloopexample {
    public static void main(String[] args) {
        //nested for ile asagidaki ciktiyi nasil elde ederiz
        // #
        //  #
        //   #
        //    #
        //     #
        //      #
        //       #

        for (int i=1; i<=7; i++){ // Satir sayisina gore bir dongu olusturduk

            for (int j=1; j<=i;j++){ // Burada bosluklari yanyana yazdirdik.
                System.out.print(" ");
            }
            System.out.println("#"); //Burada print LN ile yazdirdik. Her seferinde satir atlasin
        }

    }
}
