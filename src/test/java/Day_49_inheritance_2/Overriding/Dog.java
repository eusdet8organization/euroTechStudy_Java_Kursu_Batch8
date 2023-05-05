package Day_49_inheritance_2.Overriding;

public class Dog extends Animal{
   // String eat="Chicken";

 //   public static void main(String[] args) {
//        Dog d1=new Dog();
//       d1.eat="Salam";
//       d1.eat="";
//       eat="";// STATIC super class olsun veya olmasin, CLASS ismi ile kullanilir.
//
//       eat="";



        //ses();//Direkt olarak cagirdik. static old. icin



 //   }
   @Override
    public String cikarilanSes(String a, int xzv){
        return "Kopek hav hav dedi"+a;
    }

    @Override
    public void eat(){
        System.out.println("Kopek et yer");
    }

   //  @Override annotation statement degistirme firsati tanir
}
