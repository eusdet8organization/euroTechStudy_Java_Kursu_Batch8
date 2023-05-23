package Day_62_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class example1 {
    public static void main(String[] args) {
       // '''// String verilen="baabccdccdefeeffaa";
        // ve beklenen cikti ---------> //4a2b4c2d3e3f

        //ArrayList [String] harfler=new ArrayList<>();

    /*   int count=1;
       for (int i = 1; i <str.length() ; i++) {
           if (str.charAt(i)==str.charAt(i-1)){
               count++;
       }else {
           }
     */















        String str="baabccdccdefeeffaa";
        Object[] ArrayList;

        System.out.println(Arrays.toString(str.split("")));


        Map<Character,Integer> tekrarSayilari=tekrarSayilariniBul(str);
        for (Map.Entry<Character,Integer>s:tekrarSayilari.entrySet()){
            System.out.print(s.getValue()+""+s.getKey());
        }
    }
    public static Map<Character,Integer>tekrarSayilariniBul(String str){
        Map<Character,Integer>tekrarSayilari=new HashMap<>();
        for (char c:str.toCharArray()){
            tekrarSayilari.put(c,tekrarSayilari.getOrDefault(c,0)+1);
        }
        return tekrarSayilari;
    }

}
