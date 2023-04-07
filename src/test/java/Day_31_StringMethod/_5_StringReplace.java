package Day_31_StringMethod;

public class _5_StringReplace {
    public static void main(String[] args) {
        //Replace bir string icerisinde yer alan kelimeyi yeniden yazmamizi sagliyor. Degistiyor.

        String str="London is capital of Germany";
        System.out.println("str = " + str);
        //ilk olarak degisecek olan old karakter, ardindan yerine yazilacak yeni karakter new
        str=str.replace("London","Berlin");
        System.out.println("str = " + str);

        //Birden fazla replace etme asagidaki gibidir
        str=str.replace("Berlin","Wien").replace("Germany","Austria");
        System.out.println("str = " + str);

        //String de delete olmadigi icin, silmek icin asagidaki gibi replace kullanilabilir
        str=str.replace("Wien","").replace("is","").replace("capital","");
        System.out.println("str = " + str);

        //Bir string te gecen tum ayni karakterleri degistirmek icin
        String string1="MerHabaMerhaBa";
        string1=string1.replaceAll("[A-Z]","_");
        System.out.println("string1 = " + string1);


    }
}
