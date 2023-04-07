package Day_23_MethodOverloading;

public class _2_primeNumberMethod {
    public static void main(String[] args) {
        //please, write prime number method wih boolean
        // (Bir boolean methodu yazin, icinde tek bir int parametre olsun ve bunun asal bir sayi olup olmadigin cevabini dondur)
        //Main icinde asal sayidir veya asal sayi degildir cevaba gore yazdirin

        if (primeNumber(15)){
            System.out.println("Sayi ASAl sayidir");
        }else
            System.out.println("Sayi asal sayi DEGILDIR");
    }
    public static boolean primeNumber(int sayi){
        boolean flag=true;
        if (sayi==0 || sayi==1){
            flag=false;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                flag=false;
                break;//Bir sayi kendisinden kucuk bir sayiya bir kez olsun bolunmasi durumunda ASAL DEGIL, dongu bosuna donmesin
            }
        }
        return flag;
    }

}
