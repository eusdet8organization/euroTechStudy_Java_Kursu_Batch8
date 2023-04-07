package Day_33_ArraysMethod;

import java.util.Arrays;

public class _3_exampleArraysMethod {
    public static void main(String[] args) {
        //aabbcaabbccddeaatdfdxc
        String abc="aabbcaabbccddeaatdfdxc";
        //char ile belirli bir dizi olusturduk
        char[] karakterler=new char[args.length];
     //karakterleri alip tek tek dizi icerisinde element haline getirecegiz. Sonra Arrays.sort ile siralayip sayma islemi yapariz



        //Ayni dizileri inceleyelim (Same Array)
        int[] arr1={2,4,6,8,10};
        int[] arr2=arr1; //Burada bir diziyi yeni olusturdugum bir diziye esitledim

        System.out.println("direkt olarak esitledigim dizi :"+ Arrays.toString(arr2));

        arr1[0]=20;//Degeri olan veya default olan farketmez. Yeni deger atayabiliriz.
        arr2[4]=100;//esitledigim dizinin besince elementine yeni deger atadim

        System.out.println("arr1 dizisinin element degerleri : "+Arrays.toString(arr1));
        System.out.println("arr2 dizisinin element degerleri : "+Arrays.toString(arr2));



    }
}
