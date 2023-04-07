package Day_30_DateAndTimeAndStringClass;

public class _6_StringCharAt {
    public static void main(String[] args) {
        String str="Apple";
        char ilkHarf=str.charAt(0);

        if (ilkHarf=='A'){
            System.out.println("A ilk karakterdir");
        }else {
            System.out.println("A ilk karakter degildir");
        }

        String myCar="civic";
        if (myCar.charAt(0)==myCar.charAt(4)){
            System.out.println("Ilk ve son karakterler aynidir");
        }else {
            System.out.println("Ilk ve Son karakterler ayni degildir");
        }


        String word1="Java Script";
        //Bu String in ilk ve son karakterleri ayni mi?
        char ilkCharacter=word1.charAt(0);
        char lastCharacter=word1.charAt(word1.length()-1);//Burada lenght() 1 den basladigi icin -1 oldugunda
                                                          // SON karakteri alabiliriz

        if (ilkHarf==lastCharacter){
            System.out.println("word1 in ilk ve son karakteri esit");
        }else {
            System.out.println("word1 in ilk ve son karakteri esit DEGIL");
        }

        //word1 in uzunlugu
        System.out.println("word1 in uzunlugu :"+word1.length());
        System.out.println("word1 in son karakteri icin index"+(word1.length()-1));


    }
}
