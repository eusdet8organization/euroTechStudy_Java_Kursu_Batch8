package Day_18_NestedForLoops;

public class _12_ContinueBreak {
    public static void main(String[] args) {
    //    byte x=4;

//        for (;x<=13;x++){
//
//            if (x==8){
//                System.out.println("Sihirli sayiyiy buldunuz.");
//                x=15;// Bu degerle aslinda bir break yaptim. Fakat FARKLI
//                break;// Kosul saglanmasi durumunda BREAK sadece kendisinden onceki adimlari yazdirir.
//                     //Kendisinden sonra FOR DONGUSU icindeki tum adimlari YAZMAZ veya KOSMAZ, FOR dongusunu bitirir
//
//            }
//            System.out.println("x = " + x);// Bu for dongusu icerisinde
//        }
//        System.out.println("x = " + x);// For dongusu disinda


        int y=6;

        for (;y<=11;y++){

            if (y%8==0){ // Burada y == 8 yapisinin farkli yazilisini kullandik
                System.out.println("Sansli sayiyi buldunuz");
                y=22;
                continue;// ATLAMA islemi yapar. Kendisinden sonraki for dongusu icerisindeki statement lari atlar
            }
            System.out.println("y = " + y);
        }

    }
}
