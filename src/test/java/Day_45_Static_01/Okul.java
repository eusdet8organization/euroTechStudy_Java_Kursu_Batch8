package Day_45_Static_01;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Necdet","Calik");
        Ogrenci ogr2=new Ogrenci("Hilal","Bayrak");
    // ...
    // ...
    // ...
        Ogrenci ogr300=new Ogrenci("Necla","Saray");


        System.out.println("ogr1 = " +Ogrenci.okulAdi+ ogr1);
        System.out.println("ogr2 = " + Ogrenci.okulAdi+ogr2);
        //................
        System.out.println("ogr300 = " +Ogrenci.okulAdi+ ogr300);
    }

}
