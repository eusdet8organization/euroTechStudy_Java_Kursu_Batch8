package Day_6_DataTypeAnd_Java_Operators;

public class _6_JavaAritmaticOperators {
    public static void main(String[] args) {

        int additional, subtraction, division, multiplication, modulo;

        additional=3+5; //Toplama islemi icin -> 8

        subtraction =5-3; //Cikartma islemi yapar ->2

        division =4/2; // bolme islemi yapar -> 2

        multiplication =3*5; // carpma islemi yapar -> 15

        modulo =13%4; // Mod alma islemi yapar. birinci sayinin ikinci sayiya bolumunden kalandir.

        System.out.println("additional = " + additional);
        System.out.println("subtraction = " + subtraction);
        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiplication);
        System.out.println("modulo = " + modulo);

        int num1=10, num2=3;



        int calculation= num1*num2+(num1%num2);

        // ilk olarak parantez ici yapilir
        // ikinci olarak carpma (*), bolme (|) ve mod alma (%)
        //Son olarak lowest precedence (+ , -)

        System.out.println("calculation = " + calculation);



        int sayi1=23, sayi2=5;

        int sonuc=(sayi1-sayi2)*sayi2+(sayi1+sayi2)%sayi2;

        //oncelik sirasi PARANTEZ

        sonuc=18*5+28%5;

        //ikici oncelik  CARPMA , BOLME veya MODUL
        sonuc=90+3;

        // son asama TOPLAMA ve CIKARTMA
        sonuc=93;









    }
}
