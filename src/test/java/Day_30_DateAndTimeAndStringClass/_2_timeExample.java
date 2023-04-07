package Day_30_DateAndTimeAndStringClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import static com.sun.tools.javac.resources.CompilerProperties.Fragments.Local;

public class _2_timeExample {
    public static void main(String[] args) {
//        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
//        Date tarih = new Date();
//        System.out.println(sdf.format(tarih));


        LocalDateTime tarih = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //gun/ay/yil saat/dakika/saniye seklinde yazilmasi icin harflerin buyuk veya kucuk olmasi ONEMLI
        System.out.println(dtf.format(tarih));



    }
}
