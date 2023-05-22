package Day_62_Maps;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMaps {
    public static void main(String[] args) {
        Map<String, String> bilalBeyKartvizit=new HashMap<>();
        bilalBeyKartvizit.put("isim","Bilal Saglam");//Ekleme put() method u ile yapilir.
        bilalBeyKartvizit.put("e-mail","bilal_saglam@gmail.com");
        bilalBeyKartvizit.put("adres","Frankfurt/Almanya");
        bilalBeyKartvizit.put("telefon","0 535 454 0000");

        //bilalBeyKartvizit.get("isim") --> Bu cagrildiginda, bu Key ile tanimlanan value getirir
        System.out.println("bilalBeyKartvizit.get(\"isim\") = " + bilalBeyKartvizit.get("isim"));
        System.out.println("bilalBeyKartvizit.get(\"telefon\") = " + bilalBeyKartvizit.get("telefon"));

        Map<String, String> ismailBeyKartvizit=new HashMap<>();
        ismailBeyKartvizit.put("isim","ismail Demir");
        ismailBeyKartvizit.put("e-mail","ismail_demir@gmail.com");
        ismailBeyKartvizit.put("adres","Stutguard/Almanya");
        ismailBeyKartvizit.put("telefon","0 535 411 1110");

        System.out.println("ismailBeyKartvizit.get(\"isim\") = " + ismailBeyKartvizit.get("isim"));
        System.out.println("ismailBeyKartvizit.get(\"telefon\") = " + ismailBeyKartvizit.get("telefon"));


        Map<String,Map<String, String>> kartvizitler=new HashMap<>();//Bu karvizitler eklemeye yarar
        kartvizitler.put("Bilal",bilalBeyKartvizit);
        kartvizitler.put("ismail",ismailBeyKartvizit);

        System.out.println("Bilal in telefonu : "+kartvizitler.get("Bilal").get("telefon"));

       // Map<String, String> blabla=kartvizitler.get("Bilal");

        System.out.println("kartvizitler.get(\"ismail\") = " + kartvizitler.get("ismail"));
        System.out.println("kartvizitler = " + kartvizitler);
    }
}
