package Day_30_DateAndTimeAndStringClass;

public class _3_String {
    public static void main(String[] args) {

        //Bu sekilde bir obje veya nesne create edilebilir
        String name="Ramazan}[/ee3dflkndvmz ";

        //Bir de yeni bir nesne olusturmak icin asagidaki gibi yazabilirsiniz. Burada direkt obje olusturarak yazdik
        String lastName=new String("Ogretmis");
        //NEW kelimesi kullanilip bir STRING nesnesi olusturup onceden tanimlanmis bir deger alsa dahi FARKLI bir
        //NESNE ile tanimlanir. Onceden tanimlanmis nesneye esitlemez. YENI OBJE her sartta !!!!

        String s1="Bilal";
        String s2="Bilal";
        String s3="Ismail";
        String s4=new String("Ismail");
        String s5=new String("Bilal");
        //== objeleri kiyasliyor
        if (s1==s2){
            System.out.println("Bilal olarak yazdigimiz Objeler String Class i icerisinde ayni Objeye ESIT ");
            System.out.println("Yani s2 s1 degerine sit olgu icin sadece s1 objesine esitlendi.");
        }else {
            System.out.println("s1 ile s2 degerleri farkli");
        }
        if (s1 == s5) {

            System.out.println("Objeler esit, yani ayni degeri ifade eden objeyi tanimliyorlar");
        }
        else {
            System.out.println("Degerleri ayni olsa da FARKLI OBJELERI temsil ediyorlar");
        }


        if (s3.equals(s4)){
            System.out.println("Objelerin degerleri birbirine esit oldugunu bize gosteriyor.");
            System.out.println("Burada objelerin DEGIL objenin degeri KIYASLANDI, EQUALS ile yaptik");
        }




    }
}
