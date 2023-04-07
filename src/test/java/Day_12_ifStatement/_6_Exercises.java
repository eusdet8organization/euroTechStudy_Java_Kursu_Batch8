package Day_12_ifStatement;

public class _6_Exercises {
    public static void main(String[] args) {

        int yas = 23;

        double tax = 1.2;

        boolean evetMi = true;

        String name = "ismet";

        char basHarf = 'i';

        int sayac = 0;

        ++sayac;
        sayac++;

        // || veya, && ve, >=, <=, == ,

        sayac += sayac;

        if (sayac == 21)
            System.out.println("sayac = " + sayac);


        int x = 12;


        if (x == 10 || (x>=15 && x<100)) //islem onceligi AND

            // ESIT MI   *****boolean expression***
        {
            System.out.println("x = " + x);
        } // --> wrong.



        
        if (x >= 13){  // >= veya <= logical operatorlerde hem esittir sonra gelir. Hem de arada hicbir bosluk kabul etmez
            System.out.println("x = " + x);
        }

        //DEGIL MI

        if (!(x==10)){ // esit degil mi // Tum parantezin DEGILINI ifade eder.
                //Parantez icindeki kosullar gecerli degil ise
        }

        if ((x!=10)){ // x 10 na esit degil ise
            // Sadece x in tanimlanan degerinin degilini ifade eder. Esit degil mi der.
            // x 10 na esit degil ise
        }





        //Soru:



    }
}
