package Day_36_WrapperClass;

public class _6_wrapperValueParse {
    public static void main(String[] args) {
        String strNumber="2023";
        System.out.println("strNumber = " + strNumber);

        //String olan bir degiskenin degerini int basit degiskenin tamsayi degerine donusturur. direkt int degeri
        int number=Integer.parseInt(strNumber);
        System.out.println("number = " + number);

        //ValueOf obje nin degerini verir. Obje nin burada degeri var, hala class objesi olarak bir Tamsayi
        int number1=Integer.valueOf(strNumber);
        System.out.println("number1 = " + number1);

        strNumber=strNumber+5;
        System.out.println("String degiskene strNumber ekledikten sonra = " + strNumber);//20235

        number=number+5;
        System.out.println("ParseInt den sonra number eklendi = " + number);//2028

        number1=number1+5;
        System.out.println("ValueOf dan sonra number1 eklendi = " + number1);//2028




    }
}
