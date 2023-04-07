package Day_18_NestedForLoops;

public class _11_ContinueBreak {
    public static void main(String[] args) {

        // Saat , daka ve "saniye" dagilimini gosteren donguyu yaziniz, saat: dakika: saniye,  01 : 59 : 59


        for (int hour=0; hour<=12; hour++){

            for (int minute=0; minute<=59; minute++ ){

//   System.out.println("%02d:%02d\n", hour,minute); eger sekil olarak 01, 02 ardin 10 otomatik yazmasini isterseniz kullanabilirsiniz

              //  System.out.println("Minutes = "+ minute);
                for (int second=0; second<=59; second++){

                    System.out.printf("%02d:%02d:%02d\n", hour,minute,second); // F ile saat dongusunun yanyana yazilmasini sagladim

                }

            }
            System.out.println(); // her 60 dakika icin bir bosluk olusturdu

        }


    }
}
