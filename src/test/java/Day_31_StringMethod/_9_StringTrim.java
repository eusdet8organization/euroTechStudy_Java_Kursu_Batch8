package Day_31_StringMethod;

public class _9_StringTrim {
    public static void main(String[] args) {

        String str="Merhaba Dunya";

        boolean b=str.isEmpty();//isEmpty() methodu bir stringin bos olup olmadigini kontrol eder ve boolean deger doner
        System.out.println("b = " + b);

        str=str.toLowerCase();
        boolean b1=str.startsWith("me");//verilen karakterler ile basliyor mu sorusunu sorar ve boolean return doner
        System.out.println("b1 = " + b1);

        //Bir string in bu karakter(ler) ile bituyor mu sorusuna cevao verir endWith
        boolean b3=str.endsWith("ya");
        System.out.println("b3 = " + b3);

        //Buyuk kucuk problemini goz ardi ederek, ya da problem etmeden kontrol etmek icin
       boolean b2= str.equalsIgnoreCase("MERHaba DunYA");
        System.out.println("b2 = " + b2);


        //trim() methodu, bir string deki gereksiz bosluklari silmeye yarar. Genellikle TAB kadar bosluk silerek ilerler
        //trim() string icerisne mudahale etmez, yani string icerisinde yer alan gereksiz bosluklari silmez,
        //Sadece bastaki ve sondaki gereksiz bosluklari temizler

        String str1="        Geliyor Yeni SDET ler          ";
        System.out.println("str1 = " + str1);
        str1=str1.trim();
        System.out.println("str1 = " + str1);


    }
}
