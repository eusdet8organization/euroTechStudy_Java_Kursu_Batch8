package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _arrayListIntro {
    public static void main(String[] args) {
        // Arrays --> Tum dizilerin icindeki fonksiyonlari barindiri.
        //ArrayList ise COLLECTION altinda yer almaktadir.

        int[] sayilar={1,3,5,6,};//Burada basit degerler ile bir SABIT bir Dizi olusturduk

        ArrayList<String> isimler=new ArrayList<String>(); //Burada bir ArrayList tanimladik
        //ArrayList sadece WRAPPER class lar ile calisir

        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<Integer> saList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();


        System.out.println("eleman atamadan isimler = " + isimler);
        //Eleman ekleme
        isimler.add("Bilal");
        isimler.add("Gulden");
        isimler.add("Tazeoglu");
        isimler.add("Ramazan");
        isimler.add("Ismail");
        isimler.add("Selim");
        System.out.println("6 eleman atadik isimler = " + isimler);
        System.out.println(isimler.toString());//Burada dinamik olan dizinin print isleminde herhangi bir method a
                                              // ihtiyac yok. Dizi formatinda yazdirir

        //Eleman sayisini bulma -->uzunluk
        int elemanSayisi=isimler.size();
        System.out.println("elemanSayisi = " + elemanSayisi);//Bu dizideki kac eleman oldugunu bize verir


        //index bulma
        String elementDegeri=isimler.get(2); //0 dan baslayarak elemanlarin indexini kullanarak o indextedi elemani verir
        System.out.println(" 2 deki elementDegeri = " + elementDegeri);


        //index e eleman atama
        isimler.set(2,"GuldenT"); //Belirli index deki bir element set edebiliriz, yani degistiriyor
       // isimler.set(6,"ismet"); //olmayan bir eleman create etmiyor
        System.out.println("Set edildikten sonraki liste : "+isimler);

        //Bir elemanin indexini bulma
        int indexDegeri=isimler.indexOf("Selim");
        System.out.println("indexDegeri = " + indexDegeri);

        //Belirli bir eleman var mi yok mu
        boolean elementCheck=isimler.contains("Ismail");
        System.out.println("elementCheck = " + elementCheck);

        //Dizide eleman olup olmadigini kontrol etmek (Bos olup olup olmadigini kontrol etme)
        boolean emptyMi=isimler.isEmpty();
        System.out.println("emptyMi = " + emptyMi);

        //Eleman silme  1--> indexe gore , 2-->eleman degeri gore
        System.out.println("isimler = " + isimler); //silme oncesi
        System.out.println("isimler.remove(\"Selim\") = " + isimler.remove("Selim"));//2 e gore eleman silme
        System.out.println("ilk remove sonrasi isimler = " + isimler);
        System.out.println("isimler.remove(2) = " + isimler.remove(2));//1 e gore
        System.out.println("ikinci remive sonrasi isimler = " + isimler);


    }
}
