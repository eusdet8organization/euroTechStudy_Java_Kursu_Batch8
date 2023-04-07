package Day_31_StringMethod;

public class _3_contains2 {
    public static void main(String[] args) {
        String email="test@gmail.com";
        System.out.println(email.contains("@")); //-->beklenen cikti=TRUE

        String list="patatoes, tomatoes, eggs, milk, bread,creal,meat,apples";
        if (list.contains("bread")){
            System.out.println("bread kelimesi list string icerisinde gecmektedir.");
        }else if (list.contains("cucumber")){
            System.out.println("cucumber kelimesi list string icerisinde gecmektedir.");
        }else {
            System.out.println("cucumber kelimesi list string icerisinde yer almamistir.");
        }
        //email degeri degisti
        email="test@yahoo.com";

        if (email.contains("@gmail")){
            System.out.println("Kisinin mail adresi gmailden alinmistir.");
        }else if (email.contains("@yahoo")){
            System.out.println("Kisinin mail adresi yahoo dan alinmistir.");
        }else if (email.contains("@hotmail")){
            System.out.println("Kisinin mail adresi hotmail den alinmistir.");
        }


    }
}
