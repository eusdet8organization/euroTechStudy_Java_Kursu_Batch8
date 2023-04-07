package com.Java.Day_18_NestedForLoops;

public class _2_NestedForLoop {
    public static void main(String[] args) {
        // Nested ic ice yazma demektir. Nested ForLoop ise ic ice for dongulerini yazmak aanlamindadir.

        for (int i=1; i<10; i++) {

            System.out.println("Burasi ilk For ");

            for (int j=1; j<4; j++){ // Burada farkli bir for loop var. Farkli bir degisken tanimlanmis.
                                     // Sarti sagladigi surece dongu devam edecek. Bittikten sonra bu for disina cikacak.
                System.out.println("Burasi ikinci For");

            }// Burada for suslu parantez disina cikana kadar dongu devam eder ve kendi statement calistirir.

            System.out.println("Ikinci For disi ve ilk for ici");
        }
    }
}
