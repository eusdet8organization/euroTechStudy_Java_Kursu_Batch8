package Day_32_Arrays;

public class _3_ArraysExeption {
    public static void main(String[] args) {

        int[] sayilar={12,34,54,65,66,3,54};

        String[] isimler;
        isimler=new String[4];//Burada 4 string element icin alan acti

        isimler[1]="Bilal";//Bir elemente deger atadik
        isimler[3]="Gulsah";

        //Index 4 out of bounds for length 4  --> HATANIN alinmasina dene olur
        //Bu 4 elementli bir diziye besince bir element olusturup deger atamasi yaptik
 //       isimler[4]="Ayse"; //olmayan bir elemente deger atadik
 //       System.out.println("isimler = " + isimler[4]);


        String[] texler={"Gulden","Selim","Ramazan","Suheda","Tazeoglu"};
        boolean[] evetVeHayirlar={true,false,false,true};
        double[]  ranges={1.4,3.2,4.6,6.33,22.01};

        System.out.println("ranges.length = " + ranges.length);
        System.out.println("evetVeHayirlar = " + evetVeHayirlar.length);
        System.out.println("texler = " + texler.length);


        for (int i = 0; i < texler.length; i++) {
            System.out.println("texler = " + texler[i]);

        }

        for (int i = 0; i < ranges.length; i++) {
            System.out.println("ranges = " + ranges[i]);

        }






        String name;
        name="isim";

 //       String[] adlar;
//        adlar=new String[12];
       String[]  adlar={"isim1","isim2"};


        String[] names={"Tazeoglu","ahmet","suleyman"};
        String[] isimler1={"element"};
        System.out.println("names = " + names.length);//element sayisini verir ve 1 den baslar
        System.out.println("names (ikinci index elementi) = " + names[2]);


    }
}
