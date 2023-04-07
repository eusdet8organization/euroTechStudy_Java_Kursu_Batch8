package Day_21_Methods_1;

public class _2_methodExecution {

    public static void mesajiYaz(){ // Bir method tanimladik
        System.out.println("Method icerisindeyim");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Method dan onceki kodlar");
        System.out.println();

        mesajiYaz(); // Method un nerede oldugu degil, MAIN icerisinde hangi sirada yazdiginiz onemli.
                    //Sirasi geldiginde Method icerisindeki tum kodu calistirir, sonra alt satira gecer.
        System.out.println();

        System.out.println("Method dan sonraki kodlar\n");

    }
}
