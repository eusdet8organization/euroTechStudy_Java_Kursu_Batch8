package Day_17_ForLoops;

public class _4_forLoopOddEventNumber {
    public static void main(String[] args) {
        //1 den 100 e kadar olan cift ve tek sayilari ayri ayri toplamini yazdiriniz. Tek for ile

        int oddTotal=0;
        int evenTotal=0; // Baslangic olarak cift toplama sifir verdik ve toplam degeri icin degisken tanimladik

        for (int i=100; i>=1; i--){  // azalarak tanimlanma sekli //(int i= 1; i<=100; i++) artarak tanimlanma sekli

            if (i%2==0){  // if (i%2!=0) yani tek olanlari da baz alabilirsiniz
                evenTotal+=i;  // cift toplamini yapiyorum  evenTotal= evenTotal+i
                //System.out.println("evenTotal = " + evenTotal);  Her cift sayinin bulunmasi sonrasi toplami yazar
            }else {
                oddTotal+=i;
               // System.out.println("oddTotal = " + oddTotal);
            }
        }
        System.out.println("evenTotal = " + evenTotal);
        System.out.println("oddTotal = " + oddTotal);


    }
}
