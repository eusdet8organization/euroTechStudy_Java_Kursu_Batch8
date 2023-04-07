package Day_11_Java_Logical_Operators;

public class _5_LogicOperatorExample_2 {
    public static void main(String[] args) {
        //LOGIC OPERATOR  -- > Sartlarin degerlendirilmesi

        int num1=20;
        int num2=68;
        /*

        1- || isareti VEYA
        2- && isareti VE
        3- ! isareti DEGIL mi

         */

        System.out.println(!(4>=num1/num2 && num1*num2<=600) || num2>num1 || num1+num2==3);
         // Cozumlerken dikkat edilmesi gerekenler:
      //  1- Parantez icindeki islemden baslamak
      //  2- Parantez icinde 2 adet islemden fazla bir durum varsa islem onceligi
        // 3- degili olani belirlemek cok onemli ve DEGIL mi operatoru; degili olan kismi parantez
         // ile tanimlanir.




    }
}
