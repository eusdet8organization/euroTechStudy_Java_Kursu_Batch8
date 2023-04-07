package Day_32_Arrays;

public class _1_introduction {
    public static void main(String[] args) {

        int sayi; //declaration yaptik. TEK bir deger alabilen degisken turudur.
        sayi=4;
        String car="Honda"; //Bir string declaration yaptiniz ve bu da car ismi ile TEK bir deger atabiliyor.
                           //Farkli bir deger verdiginde oncekinin yerine gecer.



        //Birden fazla deger atayabildigimiz bir SERI veya DIZI degiskeni asagida tanimladik
        int[] sayilar=new int[5];  //Bir Dizinin declaration hali.
        //syntex olarak koseli parantez ile tanimlanir. Ve MUHAKKAK dizi sayisi atanmalidir. ZORUNLU


        //Yukaridakinin direkt deger tanimlanarak ifade edilme sekli
        int[] rakamlar={1,6,4,8,12};  //Bu da kac tane deger tanimladigini bu sekilde declaration yapabilirsiniz.


        int[] numbers;
        numbers=new int[12];//Burada 12 int deger alabilen bir dizi tanimladik




        String car1="Toyota";
        String car2="Mercedes";
        String car3="BMW";
        String car4="Honda";

        String[] cars={"Toyota","Mercedes","BMW","Honda"}; //Dort string degeri alan bir String DIZI olusturduk

        String[] arabalar=new String[4];//4 elementli bir dizi tanimladik. SABIT bir uzunluk tanimlar. yani 4
        //4 element alabilen dizinin deger atamasi asagidaki gibidir
        arabalar[0]="Toyota";//ilk elemente deger atamasi yaptik
        arabalar[3]="Honda";
        //Element ayni index gibi SIFIR dan baslar. ilk lementin indexi 0 dir.


    }
}
