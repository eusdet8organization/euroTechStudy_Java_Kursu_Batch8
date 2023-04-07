package Day_22_Methods_2;

public class _1_MethodLocalVariable {

    public static void exmple(){
        int sayi=10;
        double range=5.6;
        String name="Bilal";

        //Burada tanimlanan degiskenler LOCAL VARIABLE
        //Sadece bu method icerisinde kullanilabilir. Bu degiskenler baska bir method dan cagrilamaz


    }

    public static void main(String[] args) {

        exmple(); //Bu method u parametresiz oldugu icin direkt cagirabildik.
        exampleWithParameeters(12,35,16);

    }


    //PArametreli bir method tanimladik
    public static void exampleWithParameeters(int x, int y, int z){

        int toplam=x+y+z; //Local variable  --> Burada yer alan x, y, z birer int degeri oldugu icin, toplami bir int
        System.out.println("toplam = " + toplam);

        int yas; //Burada DEFAULT degerine sahip bir LOCAL VARIABLE tanimladik
    }
}
