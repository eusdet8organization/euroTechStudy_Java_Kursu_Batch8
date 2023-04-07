package Day_21_Methods_1;

public class _10_methodWithParameters {

    public static void main(String[] args) {

        toplama(12,25); //iki int degeri tanimlamamiz gerekli. Cunku method parametreli.
        toplama(789,56248); //iki tane farklisayi yazdik.

        for (int i = 0; i < 3; i++) { //Ayni sayilari uc kez toplamini yazdirmak istedik
            toplama(5,36);
        }
    }

    //Paarametreli bir method tanimladik
    public static void toplama(int sayi1, int sayi2){ // iki tane int parametre yazdik

        System.out.println(sayi1+sayi2); //Body kisminda verilensayilarin toplamini yazdiran bir kod statement yazdik
    }

}
