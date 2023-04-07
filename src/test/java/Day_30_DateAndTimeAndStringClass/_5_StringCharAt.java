package Day_30_DateAndTimeAndStringClass;

public class _5_StringCharAt {
    public static void main(String[] args) {
        //charAt ile String icerisindeki character leri almamizi saglayan bir String method dur.
        String word="computer";

        System.out.println(word.length());

        //ilk karakter indexi  0 dir !!!!!!
        //charAt bir karakter aldigi icin char degiskenine tanimlamamiz gerekiyor
        char ilkKarakter=word.charAt(0); //charAt() bir index parametresi ile calisir. index alinacak karakterin
                                         //sifirdan baslayarak index teki karakteri alir

        System.out.println("word objesinin degerinin ilk karakteri : "+ilkKarakter);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));//ikinci karakteri verir
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));//sekizinci karakter


    }
}
