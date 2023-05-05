package Day_50_AccessModifiry.Final_01;

public class FinalKeyword {
    public static final double PI=3.14;//CLASS VE FINAL variable. BASKA BIR DEGER ALMAZ
    public static int sayi=12;//CLASS VARIABLE


    public static void main(String[] args) {
          int sayi=15;//LOCAL VARIABLE
         final double PI=3.15; //LOCAL FINAL VARIABLE

        sayi=1;

        //static --> LOCAL STATIC OLAMAZ!!!!!       PI=1.3;//HATA VERIR


        System.out.println("FinalKeyword.PI = ");

        System.out.println("FinalKeyword.sayi = " + FinalKeyword.sayi);


        System.out.println("PI = " + PI);



    }

    public void methodFinal(){

     //   PI=3.11; //Burada static keyword kaldirilarak static olmayan bir method a cagirdik.
                 //Baska bir deger alamiyor.
                //STATIC kavrami sadece cagrilan yere kullanilmasi icin sart kosar
               //FINAL kavrMI ILE ILGILI DEGILDIR, ANCAK, final degeri olan bir degisken
            //  her yere cagrilabilmesi ve TEK deger olmasindan dolayi STATIC ile birlikte kullanilr

        System.out.println("(PI*4) = " + (PI * 4));
    }

}
