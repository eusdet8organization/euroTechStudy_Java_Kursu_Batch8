package Day_23_MethodOverloading;

public class _1_intro {
    public static void main(String[] args) {


        //Bir boolean methot yazın,en az iki tane int parametre alsın.
        // Bu parametre değişken değerlerinin ilk  rakami (yani 3465/10 =>346.5 sayısında ilk değer 3)
        // aynı ise TRUE değilse FALSE döndürsün. Sonrasında main de bu TRUE dönmesi durumunda degerleri toplasın.
        // Değil ise bölme işlemi yapsın

        int num1=4532;
        int num2=3;
        if (firstAndLastDigit(num1,num2)) //Burada if icerisinde boolean expression yani true yada false olmasi kontrol ediliyor
                                         //Bizim method boolean oldugu icin , return olan deger direkt if icerisinde yazilabilir
                                        //if (ilkdeger==sondeger) veya if(sayi1==sayi2) gibi aynisi
        {
            System.out.println(num1+num2);
        }else {
            System.out.println(num1/num2);
        }
    }
    public static boolean firstAndLastDigit(int sayi1, int sayi2){
        int firstDigit1=0; //Degisken blok disinda yazilmasi veya genel kullanima uygun yazilmasi daha kolay kullanim saglar
        int firstDigit2=0;
      //  boolean flag;
        while (sayi1>=10){
            sayi1=sayi1/10;//Bu bolme islemi basamak azaltiyor
            firstDigit1=sayi1;
        }
        while (sayi2>=10){
            sayi2=sayi2/10;
            firstDigit2=sayi2;
        }
        if (firstDigit1==firstDigit2){
      //      flag=true;
            return true;// Birden fazla return yazilabilir. Her condition saglanmasi durumunda return yazilir.
                       //Onemli olan return TYPE
        }else {
      //      flag=false;
            return false;
        }
      //  return flag;

    }
}
