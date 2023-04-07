package Day_36_WrapperClass;

public class _8_methods {
    public static void main(String[] args) {
        //Bellirli olmayan sayida gonderilen stringlerin ikinci karakterlerinin toplamini yazdiriniz
       String tex= ikiciChar("ahmet","farkindaligin","bedeli","ismet");
        System.out.println("tex = " + tex);

    }

    //String parametre sayisi belli olmayan
    public static String ikiciChar(String... str){
        String sumChar="";
        for (String s : str) {
            sumChar=sumChar+s.charAt(1);

        }
        return sumChar;
    }
}
