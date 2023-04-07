package Day_30_DateAndTimeAndStringClass;

public class _7_StringCharExample {
    public static void main(String[] args) {
        /*
     ODEV   2-Bir program yaziniz: Verilen String icersinde tekrar eden karakterleri tekrar sayisi ile birlikte yaziniz
        1-ilk olarak verilen karakterin kac kez tekrar ettigini bulalim
        String word="abcdbbasacssr";
        char aChar='a';
         */


        //1- ilk olarak verilen karakterin kac kez tekrar ettigini bulalim
        String word="abcdbbasacssr";
        char verilenChar='a';
        int counter=0;

        //word.length() dongu sayisini belirliyor. Kucuktur olmasinin sebebi, char indexi 0 dan basliyor.
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == verilenChar) {
                counter++;
            }
        }

        //expected result --> 3
        System.out.println(verilenChar+ " karakteri "+word +" icerisinde "+counter+ " kez tekrar edilmistir");


    }
}
