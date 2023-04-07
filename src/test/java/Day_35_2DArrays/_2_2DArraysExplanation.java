package Day_35_2DArrays;

public class _2_2DArraysExplanation {
    public static void main(String[] args) {
      //Degerler belli ise
        int[][] tablo1={{1,2,3},{4,5,3},{2,7,9}};  //int degerler atadik //3 satirli ve 3 stunlu diziye

        //Degerleri belli olmayan bir 2D dizisine deger atama
        int[][] tablo=new int[3][3];

        tablo[0][0]=1; //Burada 0 indexindeki satirin 0 indeksindeki stununa deger atadik
        tablo[0][1]=2;
        tablo[0][2]=3;
        tablo[1][0]=4;//birinci satir indexinin 0 indexindeki degeri
        tablo[1][1]=5;
        tablo[1][2]=3;
        tablo[2][0]=2;//2 sayi indexindeki satirin sifirinci stun degeri
        tablo[2][1]=7;
        tablo[2][2]=9;

        //6. satirda tanimlanan iki boyutlu dizi ile 11 inci satirdan baslayarak 19 uncu satira kadar ayni int
        // degerleri ile iki boyutlu diziye deger atadik.
    }
}
