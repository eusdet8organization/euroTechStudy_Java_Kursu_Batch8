package Day_33_ArraysMethod;

import java.util.Arrays;

public class _5_example {
    public static void main(String[] args) {
        //Burada bir string tanimladik
        String name="ismet";

        //String deki karakterlerin her birini kestik ve diziye atadik. Hic bosluk olmadan kesme islemi boyle oluyor
        String[] isminHarfDizisi=name.split("");//"" her karakteri kesme demek
        System.out.println("isminHarfDizisi = " + Arrays.toString(isminHarfDizisi));
    }
}
