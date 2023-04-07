package Day_21_Methods_1;

public class _6_methodExample {
    public static void main(String[] args) {

        double salary=50000;
        int creditRating=5;

        if (salary>=20000 && creditRating>=7){
            qualify();
        }else {
            noQualify();
        }
    }

    public  static void noQualify(){
        System.out.println("Uzgunum sizi CC ye ekleyemiyoruz");
    }

    public static void qualify(){
        System.out.println("Tebrikler' sizi CC ye ekleyebiliriz");
    }
}
