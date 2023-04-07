package Day_16_TernaryOperators;

public class _3_ternaryOperator {
    public static void main(String[] args) {

        int number=17;
        String result;

        //Klasik Yontem
        if (number>0){
            result="Sayi Pozitiftir.";
            System.out.println(result);
        }else {
            result="Sayi Negatiftir.";
            System.out.println(result);
        }

        //Ternary operator yontemi ile
        result=(number>0)  ?  "Sayi Pozitiftir" : "Sayi Negatiftir.";
        System.out.println("result = " + result);

        //En kisa sekli veya direkt yazdirma
        System.out.println(result =   (number>0)   ?  "Sayi Pozitiftir"   :   "Sayi Negatiftir.");
        // ? --> if yerine kullaniliyor,   : --> Else yerine geciyor.

    }
}
