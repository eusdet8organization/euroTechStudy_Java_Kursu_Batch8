package Day_31_StringMethod;

public class examplehomework {
    public static void main(String[] args) {

        /*Iki stringin ilk ve son iki karakterleri ayni olmasi durumunda true donen methodu yaziniz.
                Yani iki tane string parametre ama return type boolean olan bir method yaziniz.
*/
            characters();


        //Bir stringi iki esit parcaya bolen ve ilk yarisini yazdiran programi yaziniz
        String name = "The Life is too short.";
        int numberOfChar=name.length(); //Stringin uzunlugunu buluruz
        int halfChar=numberOfChar/2;  //ilk yarisi icin ikiye boleriz
        String halfName= name.substring(0,halfChar);
        System.out.println("halfName = " + halfName);

        String name2= name.substring(halfChar);
        System.out.println("name2 = " + name2);
        }
        public static boolean characters () {
            //boolean x, y;
            String word1 = "antarctic";
            String word2 = "antarktik";
            int first = word1.length();
            int second = word2.length();
            String firstChars1 = word1.substring(0, 2);
            String firstChars2 = word2.substring(0, 2);
            String lastChars1 = word1.substring(first - 2);
            String lastChars2 = word2.substring(second - 2);
            boolean firstChar = firstChars1.equals(firstChars2);
            boolean lastChar = lastChars1.equals(lastChars2);
            System.out.println("Ilk iki karakterler esit mi ? : " + firstChar);
            System.out.println("Son iki karakterler esit mi ? : " + lastChar);
            return true;
        }



}
