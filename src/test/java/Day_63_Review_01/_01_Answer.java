package Day_63_Review_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _01_Answer {
    public static void main(String[] args) {
        //Verilen bir string asagidaki gibi tanimlanmistir,  interview sorusu
        String verilen="baabccdccdefeeffaa";    // ve beklenen cikti ---------> //4a2b4c2d3e3f

        frekansBul(verilen);  //Verileni oldugu sirayi bozmadan sonuclari verdi
        yeniFrekansBul(verilen);//beklenen sonucu verdi

        Map<Character,Integer> arananTekrarSayisi=tekrarHarf(verilen);
        //Bu bir foreach dongusu
        for (Map.Entry<Character,Integer> sh:arananTekrarSayisi.entrySet()){
            System.out.print(sh.getValue()+""+sh.getKey());
//            sh.setValue(12);
//            System.out.println( sh);
        }








    }




    //convertString = 2b4a4c2d3e3f    --> RESULT
    private static String frekansBul(String verilen){
        String convertString="";
        for (int i = 0; i < verilen.length(); i++) {
            int miktar=0;
            for (int j = 0; j < verilen.length(); j++) {
                if (verilen.charAt(i)==verilen.charAt(j)){
                    miktar++;
                }
            }
            String arananHarf=String.valueOf(verilen.charAt(i));

            if (!convertString.contains(arananHarf)){
                convertString=convertString+miktar+verilen.charAt(i);
            }
        }

        System.out.println("convertString = " + convertString);
        return convertString;
    }



    // ve beklenen cikti ---------> //4a2b4c2d3e3f
    private static String yeniFrekansBul(String verilen){
        String yeni="";
        int miktar=0;

        String[] liste=verilen.split("");
        Arrays.sort(liste);

        for (int i = 0; i < liste.length; i++) {

            for (int j = 0; j < liste.length; j++) {

                if (liste[i].equals(liste[j])){
                    miktar++;
                }
            }

            if (!yeni.contains(liste[i])){
               yeni=yeni+miktar+liste[i];
            }
            miktar=0;
        }

        System.out.println("yeni = " + yeni);
        return yeni;
    }



    private static Map<Character,Integer> tekrarHarf(String verilen){

       // Map<String ,String > names=new HashMap<>();//Sadece bir map tanimladik.

        Map<Character,Integer> tekrarSayilari=new TreeMap<>();
        for (char ss:verilen.toCharArray()){

            int count=tekrarSayilari.getOrDefault(ss,0);

            tekrarSayilari.put(ss,count+1);
        }
        return tekrarSayilari;
    }
}
