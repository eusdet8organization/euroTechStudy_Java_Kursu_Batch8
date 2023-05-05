package Day_51_FinalKeyword;

public class _1_introSub extends _1_introduction{
    ///OVerriding -->ayni isimli methodun statement kismini degistirme islemi
    @Override
    public void eat(){
        System.out.println("Kediler sut icerler");


    }


    public void test(){
        age=24;
        name="samet";
        superTest();
    }

    public static void main(String[] args) {

       superTest();//static old. direct cagirdik.



    }

}
