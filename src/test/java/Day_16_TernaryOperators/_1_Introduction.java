package Day_16_TernaryOperators;

public class _1_Introduction {
    public static void main(String[] args) {

        int sayi=15876956;

      //  int onlar=(1286/10)=128,6;  // CASTing Double bir degeri virgulden sonrasini atarak int yazar.

        //ONLAR basamagini bulma
        int onlarBasamagi=(sayi/10)%10;  //    bolme yani / CAST yapar. % ise bolumden kalani verir

        switch (onlarBasamagi){

            case 0 :
                onlarBasamagi=1;
                // bu sart saglanmasi durumunda yapilacak islemler burada yazilir.

                System.out.println("Onlar basamagi : 0'dir.");

            break; // Break islemi bitirir.
            case 1 : System.out.println("Onlar basamagi : 1'dir."); break;
            case 2 : System.out.println("Onlar basamagi : 2'dir."); break;
            case 3 : System.out.println("Onlar basamagi : 3'dir."); break;
            case 4 : System.out.println("Onlar basamagi : 4'dir."); break;
            case 5 : System.out.println("Onlar basamagi : 5'dir."); break;
            case 6 : System.out.println("Onlar basamagi : 6'dir."); break;
            case 7 : System.out.println("Onlar basamagi : 7'dir."); break;
            case 8 : System.out.println("Onlar basamagi : 8'dir."); break;
            case 9 : System.out.println("Onlar basamagi : 9'dir."); break;
            default: System.out.println("Tanimlanamayan deger");

        }

        // Verilen bir sayinin ay numarasina gore kac gun ve hangi ay oldugunu yazdiriniz. Homework


    }
}
