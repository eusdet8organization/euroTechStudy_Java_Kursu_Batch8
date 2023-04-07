package Day_36_WrapperClass;

public class _3_wrapperClassMethod {
    public static void main(String[] args) {
        boolean c=Character.isAlphabetic('a');//Bu fonksiyon verilen degerin alfabe icerisinde yer alip
                                                        //almadigini boolean olarak doner. TRUE veya FALSE
        System.out.println(c);

        System.out.println(Character.isAlphabetic('1'));

        //bir tex yazimindaki karakter olup olmadigini boolean olarak cevap return eder.
        System.out.println(Character.isLetter('f'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetter('&'));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('d'));


        char s=65;//A degerini verir
        System.out.println("s = " + s);

    }
}
