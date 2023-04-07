package Day_32_Arrays;

public class _2_ArraysDataType {
    public static void main(String[] args) {


        int[] dizi2=new int[5]; //Bes elementli bir int dizi tanimladik
        String[] dizi3=new String[6];//Bes elementli bir string dizi tanimladik
        boolean[] dizi4=new boolean[3];//Bes elementli bir boolean dizi tanimladik
        double[] dizi5=new double[4];//Bes elementli bir double dizi tanimladik
        dizi3[2]="ismet";//Burada sadece String olan dizinin 3 uncu elementine deger atadim

        for (int i = 0; i < dizi2.length; i++)
            System.out.println("dizi2 (int) :"+dizi2[i]+" ");

        for (int i = 0; i < dizi3.length; i++)
            System.out.println("dizi3 (String) :"+dizi3[i]+" ");


        for (int i = 0; i < dizi4.length; i++)
            System.out.println("dizi4 (boolean) :"+dizi4[i]+" ");

        for (int i = 0; i < dizi5.length; i++)
            System.out.println("dizi3 (double) :"+dizi5[i]+" ");














        int[] dizi1={1,34,55,22,65,12,90,86,50};
        //dizide LENGHT alma
        //dizi1 in uzunlugu --> element sayisini tanimlar. Yani her element uzunlugu tanimlayan bir degiskendir
        System.out.println(dizi1.length);

        //YAZDIRMA
        //normal degiskenlerde direkt yazdiriyordu. Fakat dizide bu direkt olarak yazdirilamaz. CUNKU bir DIZI,
        //Birden fazla element iceriyor
        //Dongu kullanilarak yazdirma islemi yapilir
        for (int i = 0; i < dizi1.length; i++)
            System.out.print(dizi1[i]+" ");


        //Bir dizide tek bir element yazdirmak isterseniz, dongu olmadan direkt yazdirabilirsiniz
        //System.out.println("dizi2 = " + dizi3[3]);




    }
}
