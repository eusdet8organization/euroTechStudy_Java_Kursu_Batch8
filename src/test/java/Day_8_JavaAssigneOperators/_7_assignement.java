package Day_8_JavaAssigneOperators;

public class _7_assignement {
    public static void main(String[] args) {

        int num1=3+5; //ASSIGNE isleminde arittmetik operators kullanilabilir. Assigne isleminde operator ile kisaltma islemi yapilabilir

        System.out.println("num1 = " + num1);

        int num2=1+1+1+1+1-5+2;
        System.out.println("num2 = " + num2);

        System.out.println("**********************"); // num1 -> 8  num2->2

        num1-=3;
        System.out.println("num1 = " + num1); // num1 ->5

        num2+=4;
        System.out.println("num2 = " + num2); // num2-> 6

        //carpma
        num1*=3;
        System.out.println("num1 = " + num1); //num1 ->15

        int toplam=num1+num2;
        System.out.println("toplam = " + toplam); // toplam -> 21

        toplam-=num1;
        System.out.println("toplam = " + toplam); // toplam -> num2 -> 6

        //bolme
        num1/=2;

        num1 = num1/2; // yukaridaki num1/2 kisaltmasi ile ayni
        System.out.println("num1 = " + num1);

       // num2/=0; // sifir bolen deger atanabilir fakat complier da hata verir. Kod calismasini engellemez.
        //System.out.println("num2 = " + num2);


        //MOD alma  %
        toplam%=5;
        toplam=toplam%5;
        System.out.println("toplam = " + toplam);

        num1%=num2;
        num1=num1%num2; // buradaki yazimin kisaltmasi -> num1%=num2
        System.out.println("num1 = " + num1);







    }
}
