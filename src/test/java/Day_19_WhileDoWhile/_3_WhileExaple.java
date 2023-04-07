package Day_19_WhileDoWhile;

public class _3_WhileExaple {
    public static void main(String[] args) {

        char harf=65; // char degerini bir bir arttirarak kucuk a harfini bulsaya kadar dongule karakterleri yazdiriniz.
        char harf1='A';  // harf==harf1 --> TRUE

        // kucuk a harfi 97 sayisina karsilik geliyor, bunu biliyorsak

//        while (harf<=97){
//            System.out.println("harf = " + harf);
//            harf++;
//        }

        //Eger bilmiyorsak kacinci sayida oldugunu
        while (harf<='a'){
            System.out.println("harf = " + harf);
            harf++;
        }

//        for (int i=1; i<=255; i++){     // Burada 1 - 255 arasindaki karakterleri yazdirdik
//
//            char character=(char) i;  // CAST yaptik, int olan sayiyi char a dondurduk
//
//            System.out.println(i+ " = " + character);
//        }


    }
}
