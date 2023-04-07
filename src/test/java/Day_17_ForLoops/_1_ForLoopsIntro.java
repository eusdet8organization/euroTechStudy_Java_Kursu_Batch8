package Day_17_ForLoops;

public class _1_ForLoopsIntro {
    public static void main(String[] args) {


//        for ( int i = 0 ;   i <=2  ; i++  ) //  int i = 1  degisken tanimlama asamasi
//                                            //i < 10  dongunun sarti      // i++ donme sirasindaki artma ve azalma
//
//        {
//
//            System.out.println("Hello Loops "); // Donuste calisan statement veya code blogu
//
//        } // 1. dongu sonrasi  i++ ile 1 oldu.
//
//        System.out.println("Burasi dongunun disinda oldugu icin for sartina bagli degil");



//        for (int i = 1; i<10 ; i++)  // 1 den baslayarak 10 dan kucuk olan sayilari yazdirdik
//        {
//            System.out.println("i = " + i);
//
//        }



//
//        for (int j=5; j<=10; j++){ // Bir bir arttirilarak 5 den 10 a kadar sayilarin yazdirilmasi
//
//            System.out.println("j = " + j);
//        }



//        for (int num=10; num>0; num--)  // sayi 20 den baslayip 1 er azaltip 0 a kadar olanlari yazdirdik.
//        {
//            System.out.println("num = " + num);
//        }

        //10 ar artarak 0 dan 100 kadar sayilari yazdiriniz
        for (int i=0; i<=100; i+=10){  // i+=10 dongu sonrasi artis miktari
            System.out.println("i = " + i);
        }

        // 0 ile 50 arasindaki 4 un katlarini yazidiriniz
        // Bunu hem artan hemde azalan seklinde yapiniz


        for (int i=0; i<=50; i+=4){  // burada dordun katlari yazilir,
            System.out.println("i = " + i);
        }
        System.out.println("**********************");


        for (int i=50;i>=0; i-=4){  // 4 azalarak yazdirdi. Dordun kati degil
            System.out.println("i = " + i);
        }

    }
}
