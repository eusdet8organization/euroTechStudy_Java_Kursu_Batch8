package Day_17_ForLoops;

public class _7_ForLoopMultiplicationTable {
    public static void main(String[] args) {

        int num; // Burada bir int sayi tanimlanmis  instance variable olarak degiskeni tanimladim ama deger atamadim, compile etmez
        num=10;

        System.out.println(" Multiplication Table for =" + num);
        //Carpim tablosunda 10 sayisinin gosterimi ifade edilmek istenmis

        //Beklenen Cikti (Expected Result)
        /*
        1  X  10  = 10
        2  X  10  = 20

         */
        //Burada sizin ihtiyaciniz olan numaralarin 1 den 10 kadar alt alta capim seklinde 10 ile carimini gostermek
        // 1 sayisi var, ardindan carpim isareti var (Bu isaret bilgi. X olarak kullanilmali, * farkli),
        //Esittir lazim ve sayinin carpiminin degeri lazim

        for (int i=1; i<=10; i++){// Eger degisken tanimlamadan yapmak istersek
            if (num*i<=80) {//Eger carpiminin 80 ve daha kucuk olanlari yazdirmasini istersek
                System.out.println(i + "  X  " + 10 + "  =  " + i * 10);
            }
        }



    }
}
