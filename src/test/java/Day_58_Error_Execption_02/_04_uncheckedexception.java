package Day_58_Error_Execption_02;

public class _04_uncheckedexception {
    public static void main(String[] args) {
        //hata olsa bile try catch zorunlu tutulmuyorsa
        //RuntimeException islemleri
        //UncheckException olarak ifade edilebilir

        int a=2;
        int b=0;
        System.out.println(a/b);//Bu uncheck exception dir.

    }
}
