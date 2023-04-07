package Day_33_ArraysMethod;

public class _1_methodArrays {
    public static void main(String[] args) {
        //Bir Array method yazilarak nasil calisir !!!!!

        int[] plakalar={1,4,34,56,47,6,35};//element degerleri bilinen sabit bir dizi olusturduk
        int[] sayilar={12,44,32,10,56,24,76,13};
        ilkVeSonElementKontrol(plakalar);
        ilkVeSonElementKontrol(sayilar);

        //Belirli olan String dizisi olusturduk
        String[] klupler={"Galatasaray", "Besiktas","Fenerbahce","TrabzonSpor","AdanaDemir"};
        //Direkt olarak new keyword ile birlikte direkt method cagirip icinde String dizi olusturduk (ismi YOK)
        ilkElemetKonrol(klupler,new String[]{"barcelona","brezilya","milan"});

        //Actual Array : int[] sayilar={12,44,32,10,56,24,76,13};
        //Expected Arry:     .....   ={13,76,24,56,10,32,44,12}
        System.out.println("reserve olarak method dan donen array : ");

        for (int i : reserveArray(sayilar)) {
            System.out.print(i+", ");
        }

    }
    public static void ilkVeSonElementKontrol(int[] abc){
        if (abc[0]==abc[abc.length-1]){
            System.out.println("abc dizisinin ilk ve son elementleri esit");
        }else {
            System.out.println("abc dizisinin ilk ve son elementleri esit DEGIL");
        }
    }

    public static void ilkElemetKonrol(String[] str1, String[] str2){
        //Eger elemenntlerin buyuk kucuk uyumu dikkate alinmadan karsilastirmasi istenirse ignorCase kullanilir
        // Eger == operatoru ve dirakt equals kullanilirsa, birebir ayni olmasini kontrol eder
        if (str1[0].equalsIgnoreCase(str2[0])){
            System.out.println("String Dizilerin ilk elementleri birbirine ESIT");
        }else {
            System.out.println("String Dizilerin ilk elementleri birbirine esit DEGIL");
        }

    }

    //verilen dizinin elementlerinin sondan basa degistirme (son element ilk element yapma) islemi icin method olusturduk
    public static int[] reserveArray(int[] arr){
        //return type array olarak belirledik
        int[] newArray=new int[arr.length];
        //int[] plakalar={1,4,34,56,47,6,35};
       // int[] newArray={35, 6, 47, 56, 34, 4, 1};


        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[arr.length-(1+i)];//Burada son degeri yeni dizide ilk deger olarak atadik

        }
        return newArray;
    }


}
