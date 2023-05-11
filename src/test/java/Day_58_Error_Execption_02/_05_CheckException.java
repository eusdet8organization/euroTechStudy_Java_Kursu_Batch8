package Day_58_Error_Execption_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _05_CheckException {
    public static void main(String[] args) throws FileNotFoundException {
        //Try - Catch ZORUNLU tutuldugu durumlarda, CHEC KEXCEPTION olarak ifade edilir,
        //Ornegin: Thread.sleep(1000) gibi zorunlu tutulan methodlar


        //Dosya okuma/yazma islemlerinde hata olma ihtimali yuksek oldugundan,
        //Hata kontrolu zorunlu tutuluyor.

        try {
            FileInputStream file=new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


//        try {
//            FileInputStream file=new FileInputStream("liste.txt");
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        //CHECKED EXCEPTION:
        //copile error gibi duzeltilmesi zorunlu olan exception lar olarak ifade edilebilir






//        mnfgd[]]  --> COMPILE   ERROR

        System.out.println(1/0);//un-checked exception


        try {
            Thread.sleep(-5);//checked
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //TODO: Thread keyword incelenmesi tavsiye edilir.



            FileInputStream fileInputStream=new FileInputStream("file.txt");



    }
}
