package Day_31_StringMethod;

import java.util.Scanner;

public class _4_StringindexOf {
    public static void main(String[] args) {
        //Bir string icerisindeki baska bir stringi arar ve INDEX ini verir. Referans baslangic noktasidir.
        String cumle="githobbies";
        //index in SIFIR dan basladigini unutmayiniz

        System.out.println(cumle.indexOf("h"));//Burada h karakterinin sol bastan baslayarak ilk buldugu yerdeki indexini verir.
        System.out.println(cumle.indexOf("hab"));//Burada hub stringini sol bastan arar ve buldugu ilk hub in ilk harf indexini verir
        //indexOf false oldugunda -1 degeri doner
        System.out.println(cumle.indexOf("hobbies"));


        //aratilacak string karakter veya stringin aramaya baslayacagi indexi vermek icin, asagidaki gibi indexOf kullanilir
        System.out.println(cumle.indexOf("h",4));//-->expected result   -1
        //4 burada aramaya baslanacak indexi tanimlar



        String liste="java-javascript-c++-Python-PHP";

        int ilkTireIsaretiIndex=liste.indexOf("-");//Bu ilk tire isaretinin indexini bulur
        System.out.println("ilkTireIsaretiIndex = " + ilkTireIsaretiIndex);

        int ikinciTireIsatiIndex=liste.indexOf("-",ilkTireIsaretiIndex+1);//fromIndex baslangic noktasini verir.
        System.out.println("ikinciTireIsatiIndex = " + ikinciTireIsatiIndex);

        int ucuncuTireIsaretiIndex=liste.indexOf("-",ikinciTireIsatiIndex+1);
        System.out.println("ucuncuTireIsaretiIndex = " + ucuncuTireIsaretiIndex);


        liste.indexOf("-",ilkTireIsaretiIndex+1);


        //Contain ve indexOf ile aratma ve karsilastirma

        //contains ile
        if (liste.contains("java")){
            System.out.println("java kelimesi liste stringinde yer almaktadir");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir");
        }


        //indexOf ile ayni soruyu cozelim
        //indexOf da -1 degeri FALSE demektir
        if (liste.indexOf("java")>-1){  //Burada if icerisindeki degerlendirme boolean expression oldugu icin, true ise var demek
            System.out.println("java kelimesi liste stringinde yer almaktadir");
        }else {
            System.out.println("java kelimesi liste stringinde yer almamaktadir");
        }


        Scanner scanner=new Scanner(System.in);
        System.out.print("uc isimli bir ad giriniz :");
        String fullName=scanner.nextLine();

       // String fullName="Ahmet Hamdi Tanpinar";
        //Beklenen cikti= A.H.T.

        int ilkBoslukIndex=fullName.indexOf(" ");
        int ikinciBoslukIndex=fullName.indexOf(" ",ilkBoslukIndex+1);

        System.out.println("FullName kisaltilmis sekli : "+
                fullName.charAt(0)+"."+fullName.charAt(ilkBoslukIndex+1)+"."+fullName.charAt(ikinciBoslukIndex+1)+".");


    }
}
