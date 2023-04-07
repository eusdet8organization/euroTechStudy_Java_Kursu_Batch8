package Day_6_DataTypeAnd_Java_Operators;

public class _5_finalKeyWord {
    public static void main(String[] args) {

        double pi=3.14;
        System.out.println("pi = " + pi);

        int idNumber;

        idNumber=123456;


        pi=12.6; // onceki degeri bu satira geldiginde degistirir.
        System.out.println("pi = " + pi);

        // FAKAT pi degeri degismemesini istiyorsunuz.

      //  Bunun icin Java FINAL keyword gelistirmis.

        final double pi1=3.14;

        //pi1=13.9;

        final boolean evetMi;

        //Burada degiskenler farkli olabilir. Boolean, int, double

        final int idNumber1 = 123456;

       // idNumber1=23415; -> final olarak belirlenen bir degiskene yeni deger atanamaz
    }
}
