package Day_64_Review_question;

public class _01_question {
    //STATIC KEYWORD
    //1-VARIABLE
    //2-METHOD
    //3-BLOCK
    //4-Class (optional)


    public static int price;

    //STATIC VARIABLE----

    //1-Class icerisinde her yerde erisilme (dinamik olan instance variable, static keyword ile Class Variable haline geliyor)
    //2-Degiskenin degeri en son verilen deger ile her yerde degismis oluyor. Canli olarak ifade edilir
    //3-instance variable den Class variable a donusuyor.
    //4-Sinif ismi ile diger class lardan cagrilma imkani var, Hicbir obje create edilmeden cagrilma firsati veriyor.
    //5-Hicbir Obje create edilmeden hafizada obje olarak yer kapliyor.









    //------------STATIC -------keyword------
    //1- erisilme durumu degisiyor, erisebilme kolaylasiyor, cagrilma kolaylasiyor
    //2-Degisken canli hale geliyor, her zaman degeri degisiyor






    public static void main(String[] args) {//static method
        System.out.println("Hello World");
    }








    //----STATIC METHOD---
    //1-Class ismi ile diger class lardan erisilme firsati verir,
    //2-Main basta olmak uzere, static olan method larda cagrilmasi saglanir (Tum method lardan cagrilabilme imkani olusuyor)
    //3-Static method lar override edilemezler
public static void sum(){

}


















//---------STATIC BLOCK----
    //1-Tum herseyden once RUN olur, yani herseyden once kosar, Canli bir blok diyebiliriz.
    //2-Static degiskenleri , static block icerisine direct olarak deger assigne edilebilir
    //3-Access modifiry olmadan tanimlanir
    //4-Inherit durumunda, static block Canli sekilde diger class a aktarilmis olur

    static //static block
    {
        System.out.println("Hey SDETs");
    }
















//NON_STATIC BLOCK
    {
        //Before constructor, how many times
        System.out.println("NON-STATIC");
    }







    @Override
    public String toString() {
        return "_01_question{}";
    }
}
