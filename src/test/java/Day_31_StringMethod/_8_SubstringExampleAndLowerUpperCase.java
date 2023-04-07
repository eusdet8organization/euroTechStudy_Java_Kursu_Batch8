package Day_31_StringMethod;

public class _8_SubstringExampleAndLowerUpperCase {
    public static void main(String[] args) {
        String chars="{{}}";
        String word="AutoMAtion";


        String result=chars.substring(0,2).concat(word).concat(chars.substring(2));
        System.out.println("result = " + result);


        String result2=chars.substring(0,2)+word+chars.substring(2);
        System.out.println("result2 = " + result2);

        //toLowerCase-->Bir string icerisindeki buyuk karakterleri kucuk karakter haline cevirir
        //toUpperCase-->Bir string icerisindeki kucuk karakterleri buyuk karakter haline cevirir

        word=word.toLowerCase();
        System.out.println("word = " + word);

        word=word.toUpperCase();
        System.out.println("word = " + word);


    }
}
