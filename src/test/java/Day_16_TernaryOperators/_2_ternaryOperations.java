package Day_16_TernaryOperators;

public class _2_ternaryOperations {
    public static void main(String[] args) {

        int x, y;
        x=25;

        //Ternary operator a gore y degiskenine deger atama
        // X cift ise y=61, degil ise y=95
        y=(x%2==0) ? 61 : 95; // Y degiskeni
        System.out.println("y = " + y);

        //IF-ELSE gore tanimlama
        
//        boolean ciftMi=(x%2==0);
//        if (ciftMi){

        if ((x%2==0)){
            y=61;
            System.out.println("y = " + y);
        }else
        {
            y=95;
            System.out.println("y = " + y);
        }



    }
}
