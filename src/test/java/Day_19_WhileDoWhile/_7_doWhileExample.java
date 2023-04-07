package Day_19_WhileDoWhile;

public class _7_doWhileExample {
    public static void main(String[] args) {

        int sayi=23;
        int i=1;

        do {

            sayi=sayi -i;  // 1. dongu --> sayi=22 : 2. dongu sayi=20
            i++;  // 1. dongu --> i=2, 2. dongu i-->3
            System.out.println("sayi = " + sayi);  // 22, 20
            // beklenen cikti:  22

        }while (sayi%5!=0); //20/5 = 0

        //  While (sayi%5==0) SARTI saglamiyor ama WHILE satirina kadar boy calisiyor. ILK KEZ.

    }
}
