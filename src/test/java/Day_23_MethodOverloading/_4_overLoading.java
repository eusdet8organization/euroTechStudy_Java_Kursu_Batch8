package Day_23_MethodOverloading;

public class _4_overLoading {

    public static void toplama2(int sayi){
        int x=3;

        System.out.println(x+sayi);
    }
    public static void main(String[] args) {

        toplama1(); //Sadece methodu cagirir ve yazdirir. Veri gitmiyor ve veri dondurmuyor. method Type=>VOID
        toplama2(17);// Sayi gonderiyor ama veri dondurmuyor. method type => VOID ve int parametre

        //OverLoading
        toplama(12,34); //Burada veri gonderiyorum ve veri donduruyor, method type => INT ve parametreli
        toplama(16,38,11); // veri gonderiyor ve veri donduruyor. method type=> INT
    }
    public static void toplama1(){
        int x=3;
        int y=4;
        System.out.println(x+y);
    }
    public static int toplama(int x, int y){

        return x+y;
    }
    public static int toplama(int x, int y, int z){

        return x+y+z;
    }

}
