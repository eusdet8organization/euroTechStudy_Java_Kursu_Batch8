package Day_8_JavaAssigneOperators;

public class _5_relationalOperatorsExample {
    public static void main(String[] args) {

        // Variable Definition and Initianlization  (degiskeni tanimlama ve ilintilendirme)

        int rakam= 3;

        int sayi=4;

        System.out.println("Rakam ve Sayi birbirine esit mi = "+(rakam==sayi));  // cikti? -> FALSE  ==


        System.out.println("Sayi Rakamdan kucuk mu = "+(sayi<rakam));  // cikti -> FALSE  -> boolean return

        System.out.println("Rakam sayidan buyuk ve esit mi = "+(rakam>=sayi)); // cikti FALSE

        System.out.println("Rakam ve sayi esit degil mi = "+(rakam!=sayi));  // cikti TRUE

        System.out.println("Rakam sayidan kucuk ve esit mi  = "+(rakam<=sayi)); // cikti TRUE

        System.out.println("Sayi rakamdan buyuk mu ="+(sayi>rakam)); // cikti TRUE



    }
}
