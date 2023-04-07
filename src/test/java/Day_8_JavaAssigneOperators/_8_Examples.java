package Day_8_JavaAssigneOperators;

public class _8_Examples {
    public static void main(String[] args) {


        int number;  // DEFAULT degere aritmatik veya diger java operatorleri implement edilemez.

       // --number;  // ilk olarak default degerinden farkli bir deger atamak gerek


        number=24;

     //   --number-=13;  // ayni anda iki oparator esitligin sag tarafinda kullanilamaz.

        number-=12;  // 12
        number++;  // 13

        number/=3; //4.333 ise int oldugu icin 4

        number--; //3
        --number; //2

        number-=2; // 0

        System.out.println("number = " + --number);  // outPut  `-1`
        System.out.println("number = " + number--); // output `-1`
        System.out.println("number = " + number);  // output `-2`



        double deger=12.45;
        int deger1=3;

        deger/=deger1;  // 4.15   ->   ayni zamanda -> deger=deger/deger1
        System.out.println("deger1 = " + deger1); //hicbir degisiklik yasamamis deger1 =3 int bir degisken
        System.out.println("deger = " + deger); //deger double bir degisken deger=4.15

        deger1= (int) deger; // int olan bir deger1= deger(double olan bir deger)
        System.out.println("deger1 = " + deger1);  // cevap deger1 =4

    }
}
