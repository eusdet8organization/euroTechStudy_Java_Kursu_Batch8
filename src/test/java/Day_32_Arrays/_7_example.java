package Day_32_Arrays;

public class _7_example {
    public static void main(String[] args) {
        String[] futbolcular=new String[11];
        //Takim 11 kisiden olusuyor. Fixed bir sayi. Yani sabit

        futbolcular[0]="Pele";
        futbolcular[1]="Messi";
        futbolcular[2]="Ronaldo";
        futbolcular[3]="Hami";
        futbolcular[4]="Ali";
        futbolcular[5]="Samiyen";
        futbolcular[6]="Hasan";
        futbolcular[7]="Hakan";
        futbolcular[8]="Emre";
        futbolcular[9]="Alex";
        futbolcular[10]="Lefter";

        //Verilen Dizinin elementlerinin ilk harflerini yazdiriniz.

        System.out.print("Futbolcularin isimlerinin ilk harfleri : ");
        for (int i = 0; i < futbolcular.length; i++) {

           char ilkHarf= futbolcular[i].charAt(0);
            System.out.print( ilkHarf+". ");

        }



    }
}
