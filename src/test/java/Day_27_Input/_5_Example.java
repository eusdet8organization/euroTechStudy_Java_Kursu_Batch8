package Day_27_Input;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class _5_Example {
    public static void main(String[] args) {
        //Kullanicidan Cadde, sokak , postaCodu(int) ve ulke bilgilerini isteyip yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Lutfen cadde bilgisini giriniz : ");
        String cadde= oku.nextLine();

        System.out.print("Lutfen sokak bilgisini giriniz :");
        String sokak= oku.nextLine();

        System.out.print("Lutfen postaKodu bilgisini giriniz : ");
        int postaKodu=oku.nextInt();

        oku.nextLine();//int den String e gecerken alinan hatayi ortadan kaldirir
        System.out.print("Lutfen ulke bilgisini giriniz : ");
        String ulke=oku.nextLine();

        System.out.println("Adres Bilgisi = "+cadde +", "+sokak+", "+postaKodu+", "+ulke);

    }
}
