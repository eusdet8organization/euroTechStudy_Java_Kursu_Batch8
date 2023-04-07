package Day_13_IfElseIf;

public class _7_ExampleSlayts {
    public static void main(String[] args) {

        boolean sayiCiftMi;
        int sayi=15;
        
        //GEREKSIZ DETAY
        if (sayi%2==0){ //sayi%2 sayinin 2 ye bolumundan kalan
            sayiCiftMi=true;
        }else {
            sayiCiftMi=false;
        }
        
        // GECERLI ISLEM boolean icin
        boolean ciftMi = sayi%2 == 0; // Burada islemin cevabini boolean direkt olarak alir.
        
        
        //Hatirlama icin
        char ilkHarf=65;
        System.out.println("ilkHarf = " + ilkHarf);
        ilkHarf='A';
        
    }
}
