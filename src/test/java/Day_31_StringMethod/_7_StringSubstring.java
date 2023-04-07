package Day_31_StringMethod;

public class _7_StringSubstring {
    public static void main(String[] args) {
        //substring alt anlamindaki bir stringi ifade eder. Bu su demek: Bu string icerisinden bir kismini alarak keserek yeni 
        // bir string olusturur
        
        String str="java String Manipulation is fun!";
        
        //Eger bir startIndex verip baska bir sey vermezsek, o index ten itibaren kalani ile yeni bir string olusturur
        str=str.substring(5);
        System.out.println("str = " + str);

        str=str.substring(20);
        System.out.println("str = " + str);

        str=str.substring(0,2); //ilk DAHIL, son DAHIL DEGIL
        System.out.println("str = " + str);
        
    }
}
