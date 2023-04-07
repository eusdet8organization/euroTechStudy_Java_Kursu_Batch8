package Day_35_2DArrays;

import java.util.Arrays;

public class _6_raggedArray {
    public static void main(String[] args) {
        //int olmasinda ragmen NULL yani tanimsiz olarak satirlar atiyor
        int[][] sayilar=new int[3][4]; //Zorunlu olan ve ilk kutu satirdir
        System.out.println(Arrays.deepToString(sayilar));

        int[] ciftSayilar={12,46};

        sayilar[1]=ciftSayilar;//Burada bir diziyi tablodaki ikinci satirda bulunan elemani
        // yani 1 inci satir indexinde yer alan satir dizisi

        System.out.println(Arrays.deepToString(sayilar));

        //Burada baska bir tek boyutlu diziyi, tablodaki 0 indexindeki satira atadam. satir 1 den sonra yaptim
        int[] tekSayilar={11,45,77,34};
        sayilar[0]=tekSayilar;
        System.out.println(Arrays.deepToString(sayilar));


        //Degerleri belli olmayan ama eleman sayisi belli olan bir Tek boyutlu dizi olustrup degerler atadik
        int[] asalSayilar=new int[7];
        asalSayilar[0]=13;
        asalSayilar[1]=2;
        asalSayilar[2]=3;
        asalSayilar[3]=53;
        asalSayilar[4]=73;
        asalSayilar[5]=33;
        asalSayilar[6]=31;

        sayilar[1]=asalSayilar;
        sayilar[2]=asalSayilar;//Asal sayilari 2 inci indexteki satira bir tek biyutlu dizi atadik. Bu da yedi
                               //elemanli bir dizi

        System.out.println(Arrays.deepToString(sayilar));







        int[][] sayi={{1,3,},};
//        sayi[0][0]=1;
//        sayi[0][1]=3;

        System.out.println(Arrays.deepToString(sayi));








    }
}
