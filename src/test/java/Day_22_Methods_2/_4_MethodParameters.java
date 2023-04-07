package Day_22_Methods_2;

public class _4_MethodParameters {
    public static void main(String[] args) {

        deerPlay(60,true); //FALSE sadece ilk if in icindeki else yazdirdi
        deerPlay(90,false);//TRUE
    }
    public static void deerPlay(double temp , boolean isSummer){

        if (isSummer){
            if (temp>60 && temp<100){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }else {
            if (temp>60 && temp<90){
                System.out.println(true);
            }else
            {
                System.out.println(false);
            }
        }

    }

}
