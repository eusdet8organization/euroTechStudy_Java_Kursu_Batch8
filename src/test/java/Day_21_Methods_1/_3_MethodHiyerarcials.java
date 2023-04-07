package Day_21_Methods_1;

public class _3_MethodHiyerarcials {
    //Dort adet method tanimladik

    public static void mesajiYaz(){
        System.out.println("Mesaji yazdir");
    }

    public static void main(String[] args) {

    //    System.out.println("ilk olarak mesaji yaz methodunu cagir");
        mesajiYaz();//main methodunun uzerinde tanimlamistik

    //    System.out.println("Mesaji gonder methodunu cagir");
        mesajiGonder(); // Son sirada tanimlanan method

       // System.out.println("Mesaji oku methodunu cagir");
        mesajiOku(); //Main methodu sonrasi tanimlanan method

     //   System.out.println("tum methodlari yazdirdik");
    }

    public static void mesajiOku(){
        System.out.println("Mesaji Oku");
    }

    public static void mesajiGonder(){
        System.out.println("Mesaji Gonder");
    }

}
