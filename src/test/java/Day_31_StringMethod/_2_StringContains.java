package Day_31_StringMethod;

public class _2_StringContains {
    public static void main(String[] args) {

        //Contains --> Bir String deki karakterin(lerin) olup olmadigini kontrol etmeye yarar.
        //Boolean expression ile cevap dondurur. Yani TRUE veya FALSE olarak return deger doner.

        String str="Merhaba";
        System.out.println(str.contains("a"));//Boolean deger yazdiracak

        boolean varMi=str.contains("a");//Boolean deger dondugunu bildigimiz icin boolean bir degisken tanimladik ve sonucu atadik

        System.out.println("varMi = " + varMi);
        System.out.println("varMi (aba) = " + str.contains("aba"));//str stringin icerisinde "aba" geciyor mu? Cevabi doner
        System.out.println("varMi (f) = " + str.contains("f"));
        System.out.println("varMi (A) = " +str.contains("A") );
        System.out.println("varMi (e,a) = " +str.contains("e,a") );
        System.out.println("varMi (ea) = " +str.contains("ea") );






    }
}
