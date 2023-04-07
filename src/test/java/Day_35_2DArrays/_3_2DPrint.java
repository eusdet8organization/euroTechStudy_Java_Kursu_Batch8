package Day_35_2DArrays;

import java.util.Arrays;

public class _3_2DPrint {
    public static void main(String[] args) {
        String[] kelimeler={"Bilal","ahmet","mehmet"};
        int[] sayilar={1,3,8,5,3};

        //Yazdirma for ile
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.print(kelimeler[i]+" ");
        }
        System.out.println("-----------------------");
        //Foreach ile yazdirma
        for (String s : kelimeler) {
            System.out.print(" " + s);
        }
        System.out.println("***********************");

        //Array icerisindeki toString() methodu ile
        System.out.println(Arrays.toString(kelimeler));


        int[][] tablo1={{1,2,3},{4,5,3},{2,7,9}};



        int[][] tablo=new int[3][3];
        tablo[0][0]=4;
        System.out.println("tablo[0][0] = " + tablo[0][0]);

        //Satir degistiriyor
        for (int satir = 0; satir < tablo1.length; satir++) {
            //Satirin stun degerlerini yazdiriyor
            for (int sutun = 0; sutun < tablo1[satir].length; sutun++) {
                System.out.println(satir +"`inci satirin "+sutun+" `inci stun degeri :"+tablo1[satir][sutun]);
            }
        }

        //String type olan 5x5 arayy create edin
        String tax[][]=new String[5][5];


        //LENGHT

        int[] sayi={1,6,9,10,34};

        //uzunlu--> eleman sayisi
        System.out.println(sayi.length);

        int[][] sayilar1={{1,2,4},{5,7,9},{12,45,23}};
       //  sayilar1.length --> sizin eleman sayisini verir. ELEMAN SAYISI = SATIR SAYISINA ESITTIR
        // yani sayilar1.lenght derseniz satir sayisini verir
        System.out.println("sayilar1.length = " + sayilar1.length);

        //Bu elemanlarin icerisindeki degerleri yani stunlarin uzunlugunu nasil buluruz
        //Sifirinci index de yer alan elemnanin UZUNLUGU  YANI -->STUN SAYISI
        System.out.println("sayilar1[0].length = " + sayilar1[0].length);


    }
}
