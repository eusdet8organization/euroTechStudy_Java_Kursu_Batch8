package Day_30_DateAndTimeAndStringClass;

public class _4_StringLenght {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str);
        String tex="euro Tech     Study";

        int x1=str.length(); //str objesinin karakter sayisini verir uzunluk olarak
        System.out.println("x1 = " + x1);

        //lenght() ,String  class i icersinde olan methottur. Uzunlugu hesaplar
        System.out.println("tex = " + tex.length());
        System.out.println(tex.length()*10);

        String name=new String("Gulden Hanim");
        int strUzunluk=name.length();
        System.out.println("New ile olusturulan nesnenin uzunlugu : "+strUzunluk);



    }
}
