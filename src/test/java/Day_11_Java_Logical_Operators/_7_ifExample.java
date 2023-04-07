package Day_11_Java_Logical_Operators;

public class _7_ifExample {
    public static void main(String[] args) {

        //******* Kalan dakikalarin saniye cinsinden dogru sonuc verdigini test edin.


        int dakika=11;
        int saniye=60;

        int toplanSaniye=dakika*saniye;

        if (toplanSaniye==665){ // EGER toplam saniye 660 a esit ise IF ile cercevelenen kodlar calisir

            System.out.println("toplanSaniye = " + toplanSaniye);



        }

        // Bu parantez ile kosulun testi' tum olasiklari denemek zorunda kalmadan SONUC.




        // ALISTIRMA -2
        // Soru: 2 tane int degisken tanimla x ve y , x ve y ye deger at / al.
        // Eger y 0 dan buyuk ise x' in degerini DEGISTIR ve 1 ata, ve x ve y ni degerlerini yazdirim.

        int x=-20;  // 10 gigit number  ++++ ve ---
        int y=12;

        if (y>0){
            x=1;
            /*
            operatorlerde x=x+1 ile x+=1 esit bir durumu ifade ediyor.
             */
        }
        System.out.println("y = " + y);
        System.out.println("x = " + x);





        // EGER ile ifade edilen kosulun en sade seklinde yazilmasi ve islem onceliklerinin paranteze
        // alinmasi  -- > Logic operatorlerin en cok kullanildigi alandir.

        int number1=36;
        int number2=3;


        if (!(number2/number1==4 ||(number2*number1>100 && number2%4==0)) ){
            number2+=55;
            number1-=25;
            number2++;
            ++number1;
            System.out.println("number1 = " + --number1);
            System.out.println("number2 = " + ++number2);

            int num=234356456;
            num*=number1;
        }
        System.out.println(number2/number1==5);


    }
}
