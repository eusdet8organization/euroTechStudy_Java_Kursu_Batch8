package Day_58_Error_Execption_02;

import java.io.IOException;
import java.util.Scanner;

public class _06_checkHandle {
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Hava sicakligi = ");
        int sicaklik= oku.nextInt();


        //ilk yontem ile main de try-catch kullandik
//        try {
//            sicaklikKontrol(sicaklik);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //Method icerisinde trow ile hatayi handle ettik
        sicaklikKontrol(sicaklik);


    }


    public static void sicaklikKontrol(int sicaklik){
        try {

            if (sicaklik <= 10) {
                throw new Exception("Hava gercekten soguk disari cikmayin");
            } else {
                throw new Exception("Disarida basketbol oyanayabilirsiniz");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
