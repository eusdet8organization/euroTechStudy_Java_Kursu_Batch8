package Day_5_DataType;

public class _4_concatenation {
    public static void main(String[] args) {

        //String degiskeni tanimlama
        //Birlestirme

        String name ="Ahmet";
        //String bizim degisken TYPE
        //name - > (degisken ismi)=
        //"ismet" string degeri

        System.out.println("Hello World"); // String bir deger yazdirmistik.


        System.out.println("name = " + name);

        String firstName="ismet"; // bir String degisken atadik

        String lastName; // Decleration seklinde degisken atadik
        lastName="   gunes";

        System.out.println("Benim adim saoyadim = "+ firstName+lastName);

        //TODO: String tanim=""; // String degeri icin sadece cift tirnak
        // String degiskeninde cift tirnak icinde tum karakterler yer alir. 
        
        String merhaba="Hello ";
        String dunya="World";
        String bosluk=" ";
        String merhabaDunya="merhabaDunya = " +merhaba+bosluk+dunya;

        System.out.println("merhabaDunya = " + merhaba+bosluk+dunya);
        System.out.println( merhabaDunya);
        
        
        firstName ="ismail";
        String bosluk1=" ";
        lastName ="korkmaz";
        System.out.println("firstName = " + firstName);
        
        String fullname="fullname = "      +firstName+bosluk1+lastName;
        System.out.println(fullname);

        firstName="Ahmet";
        System.out.println("firstName = " + firstName);


        String siir="dusunmek en buyuk armaginidir insanin";

        // secili olan bir String degerini secip cift tirnak ile kolayca string degerine donusturebilirsiniz.

        //TODO:TASK: Benim Siirim : siirin tamami ve YAZAR : yazar dir.

        /*
        Burada Benimsiirim kelimesi ve YAZAR : sabit. Siir ve yazar degisken. dir sabit

        dusunmek en buyuk armaginidir insanin, yazar : I.G.
         */

        String siirinMetni="dusunmek en buyuk armaginidir insanin";
        String yazar="I.G.";

        System.out.println("Benimsiirim = "+siirinMetni+" YAZAR :"+yazar+"`dir");


        
    }
}
