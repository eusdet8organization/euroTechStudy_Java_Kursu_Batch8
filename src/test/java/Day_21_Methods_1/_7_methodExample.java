package Day_21_Methods_1;

public class _7_methodExample {
    public static void main(String[] args) {
        //Method birden fazla kez cagrilabilir.
//        merhaba();
//        merhaba();
//        merhaba();
//        merhaba();

        //For ile kac kez istenirse method cagrilip calistirilabilir
        for (int i = 0; i < 4; i++) {
            merhaba();
        }

    }


    public static void merhaba(){
        System.out.println("Merhaba Dunya");
    }
}
