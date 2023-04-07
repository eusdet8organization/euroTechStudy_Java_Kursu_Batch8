package Day_13_IfElseIf;

public class _5_IfElseIf {
    public static void main(String[] args) {
        int x=3;
        int y=5;
/*
        //Birincil durum
        if (x>y){
            System.out.println(" X degeri Y den buyuktur");
        }else{
            System.out.println("X degeri Y den buyuk degildir veya X degeri Y den kucuk veya esittir");
        }

        //ikincil durum
        if (x>y){
            System.out.println("Buyuk deger X dir");
        }else
            if (x == y){
                System.out.println("X ile Y esittir");
            }else {
                System.out.println("X, Y den kucuktur");
            }



// **************** *****************************/////
        // int x=3;
        // int y=5;

        if(x>=y){
            x+=5; // x=x+5; x->8, y->5
            x+=y; // x=x+y; x->13 , y->5
            --y;  // y->4
            x++;  //x->14
            System.out.println(x++);//x 14 olarak print eder, ama degeri 15 olur
            // x->15 , y->4
            int toplam =x+y; // Buradaki x degeri icin onceki islemler dikkate alindi
            System.out.println(toplam);// toplam 19
        }


        // x in degeri kac--> Selim bey -- > 15 Suheda hanim ayni degeri soyledi, Semra hanim ayni fikirde

        // X in degeri 3 tur.
        System.out.println("X in degeri "+x);







    }
}
