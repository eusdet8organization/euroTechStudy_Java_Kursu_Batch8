package com.Java.Day_18_NestedForLoops;

public class _1_ForLoopsRules {
    public static void main(String[] args) {

        //long x=1, y=3;
//        long x, y;

        for (long x=1, y=3; x<=2 && y<=3; x++, y++){ // Dongunun sarti olmaliydi. Bu ayni zamanda siniri belli olan demek.
            System.out.println("Selam");
        }
        //Iki degisken tanimlayip sartina ikisini de ekleyebiliriz. Burada y=3 esit oldugu icin ve sartta y<=3 oldugundan
        // dongu bir kez donecektir.

        long x=2;
        int y=1;
        for ( ; x<4 && y<2; x++, y++){
            System.out.println("Merhaba");
        }// Faarli sekilde iki degisken for dongusu disinda tanimladik, sarti ve artis azalisini yazdik.

    }
}
