package Day_19_WhileDoWhile;

public class _1_While {
    public static void main(String[] args) {

//        for (int i=4; i<=21; i++){ // Burada sinir BELLI
//            System.out.println("i = " + i);
//        }

        int x=15;

        //FOR dongusunden farkli olarak sarta bagli donguyu ifade eder.
        while (x>10){ // While onceden siniri belli olmayan donguler icin kullanilir.
            System.out.println(" Dongu sarti saglaniyor.");

            x--;// Syntex olarak artis ve azalis While statement sonunda yer alir.
               //While sarti boolean olarak tanimlanir ve TRUE oldugu surece Kod Blogunu yani suslu parantez icini
            // calistirir.

        }

        // While ile yazilan bir algoritma FOR ile de yazilabilir.
        //SADECE TEK FARK sinirlarin onceden belli olmayan donguler icin WHILE kullanilir (FOR kullanilamaz.).

    }
}
