package Day_17_ForLoops;

public class _6_forLoopRepeat {
    public static void main(String[] args) {

        int num1=50;
        int num2=24;
        int repeat=4; // tekrar demek, tekrar sayisi
        //sayinin buyuk mu kucuk mu veya esit mi tekrar sayisinca durumlarini yazdiriniz

        for (int i=1; i<=repeat; i++){

//            if (num1>num2){
//                System.out.println("Num1 is greater than num2");
//            } else if (num1<num2){
//                System.out.println("Num2 is greater than num1");
//            } else if (num1==num2){
//                System.out.println("Num1 is equal to num2");
//            }

            System.out.println((num1>num2) ? "Num1 is greater than num2" : num1<num2 ?  "Num2 is greater than num1" : "Num1 is equal to num2");
            //Ternary ile sartlarin yazilma sekli

        }


    }
}
