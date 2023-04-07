package Day_20_BranchingStatementAndLabelleb;

public class _1_BranchingExamples {
    public static void main(String[] args) {

//        int sum=0, number=0;
//
//        while (number<20){
//            number++;
//            sum+=number;
//
//            if (sum>=100)
//                break;
//
//        }
//        System.out.println("The number is = " + number);
//        System.out.println("The sum is = " + sum);

//        int i = 0;
//        int sum = 0;
//        for (i = 0; i < 20; i++) {
//            sum += i; //Burada 20 kez dondu. Sonuc i=19, sum=190

  //      }
       // if (sum >= 100) {
//            System.out.println("The number is " + i);
//
//            System.out.println("The number is " + sum);

       // }

//        int sum=0, number=0;
//        boolean kontrol=true;
//        while (kontrol) {
//
//            number++; //Numaranin onemi yok. 20 denmesinin burada sadece dongu icin verilmis bir deger.
//                     //O yuzden toplam dongude artarak devam etsin. Onmeli olan toplam yani SUM
//
//            if (sum < 100){ //SART TOPLAMDA SAKLI
//                           //Toplami if sarti saglandiktan sonra yapiyoruz.
//            sum += number; //Burada SUM yuzden kucuk oldugu surece burada toplama yapacak.
//           // break; COK daha kolay ve sade kod yazimi ile birlikte statement yaziminda zaman tasarrufu saglar,
//            }else {
//                number--;
//                kontrol=false; //Toplam 100 veya uzeri bir rakam ise dongu dursun
//            }
//
//        }
//        System.out.println("The number is " + number);
//        System.out.println("The sum is " +sum);



        int num = 0;
        int sum = 0;

        for(int i = 1; i < 20 && sum < 100; i++){
            num = i;
            sum += i;
        }

        System.out.println("The number is " + num);
        System.out.println("The sum is " + sum);



        //BREAK --> Daha efektif kod icin ve kolay cozumler icin gerekli

        //Ternary operator -- > If = ? ve Else=:

        //Break icin boyle bir kisa kodlama sekli YOKTUR
    }
}
