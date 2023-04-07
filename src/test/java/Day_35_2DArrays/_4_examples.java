package Day_35_2DArrays;

import java.util.Arrays;
import java.util.Random;

public class _4_examples {
    public static void main(String[] args) {
        //dort ogrencinin dort dersten aldigi puanlari gosteren int bir 2D create edin.
        //10 ile 100 arasinda degerler verin. Ve yazdiriniz


        int[][] scores=new int[4][4]; //dort ogrenci ve dort ders tablosunu olusturduk

        for (int satir = 0; satir < scores.length; satir++) {
            for (int sutun = 0; sutun < scores[satir].length; sutun++) {

                //Score degerlerini random olarak atadik
                Random rd=new Random();
                int note=scores[satir][sutun]=rd.nextInt(100-10+1)+10;
                System.out.println("note = " + note);//deger atamasi ile birlikte yazdirdik
                
            }

        }
//deepToString 2D dizilerde yazdirma methodu olarak java kutuphanesinde yer aliyor
        System.out.println("2D array lerin yazdirma methodu ile ciktisi : "+ Arrays.deepToString(scores));
        
        //iki for ile yazdirma  scores[satir][sutun]--> Her bir exel kutucugu gibi dusunebiliriz

        for (int satir = 0; satir < scores.length; satir++) {
            for (int sutun = 0; sutun < scores[satir].length; sutun++) {
                System.out.println("iki for ile 2D dizinin ciktisi : "+scores[satir][sutun]);
                
            }
            
        }

        //bilinen tek boyutlu dizi bilgisiyle yazdirma, foreach kullanarak
        for (int[] score : scores) {
            System.out.println(Arrays.toString(score));
        }
        //[10, 100, 82, 54]
        //[64, 44, 100, 28]
        //[60, 57, 85, 15]
        //[27, 20, 88, 14]
        
        
        

    }
}
