package Day_57_Error_Execption_01;

import java.time.LocalDate;
import java.time.Month;

public class _04_TryCatch {
    public static void main(String[] args) {

        System.out.println("Program basladi");

        try {
            System.out.println("Tarih set ediliyor");
            System.out.println(1/(1-1));
            LocalDate date=LocalDate.of(2023,Month.MAY,40);
            System.out.println("islem tamam");
        }catch (ArithmeticException e){
//            System.out.println("Verilen tarih degerlerini kontrol ediniz");
//            System.out.println("Ay icin 1-31 arasinda deger alaabilir");

            //Exception class indan olusan obje ile hatanin mesajini almamizi sagliyor
            System.out.println("e.getMessage() = " + e.getMessage());//hatanin mesaji

        }



    }
}
