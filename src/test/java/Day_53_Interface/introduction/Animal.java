package Day_53_Interface.introduction;

public interface Animal { //Bu bir interface sinifi
    //Interface sinifinda DEFAULT olarak "public static final" default olarak yer alir
    public static final int SAYI=123;
    static final int SAYI1=123;
    final int SAYI2=123;
    int SAYI3=123;

    public abstract String food();//Burada dadefault olarak abstract method create eder.


}
