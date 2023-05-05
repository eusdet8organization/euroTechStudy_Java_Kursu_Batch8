package Day_51_FinalKeyword;

public class _1_introduction {

    //OVERLOADING --> fazla yukleme--> ayni isimli method farkli parametreler ile yazildi
    public static int toplam(int a, int b){
        return a+b;
    }

    public static int toplam(int a){
        return a;
    }

    public static int toplam(int a, int b, int c){
        return a+b+c;
    }
    public static int toplam(){
        int a=5, b=7;
        return a+b;
    }


    /////////////////////////////////////////////////////


    public static void main(String[] args) {

        toplam(2,5,6);
        toplam(2,5);
        toplam(2);
        toplam();


    }

    int age;
    String name;

    //SUPER CLASS icinde override yapilacak method
    public void eat(){
        System.out.println("canlilar birseyler yiyerek yasarlar");


    }

    public static void superTest(){
        System.out.println("Super class icerisinde bir static method yazdik");
    }





    ///OVerriding -->ayni isimli methodun statement kismini degistirme islemi
    //overriding inheritance icerisinde super class dan alinan bir methodu sub class da degistirmek icin kullaniriz

//    @Override
//    public void eat(){
//        System.out.println("Kediler sut icerler");
//    }





}
