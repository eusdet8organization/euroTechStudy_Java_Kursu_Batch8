package Day_21_Methods_1;

public class _4_methodExecution {

    public static void method1(){
        System.out.println("Method1 kodunu calistirdi.");
        System.out.println("Method1 in ikinci sirasi");
    }









    public static void main(String[] args) {
        //Butun Methodlari tek bir method icerisinde ve sade sekilde yazdirma
        methodlar();
    }

    //TEMEL AMAC KOD YAZIMINDA
    //Afficiency Memory --> Hardiski en az yoran kod yazimi
    //RAM --> En az kullanim ile calismak
    //Clean Kod Ahlaki (SOLID cradentials) --> interview sorusu  (CTO --> Tum IT deparmanin sorumlusu)










    public static void method2(){
        System.out.println("Method2 kodlarini calistirdi");
    }
    public static void methodlar(){
        //Bir method diger bir method ile cagrilabilir
        System.out.println("Methodlar adli fonksiyonumuz calistirdik");
        method1();
        method2();
    }

}
