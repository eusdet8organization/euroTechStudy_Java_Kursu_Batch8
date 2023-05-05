package Day_51_FinalKeyword;

public class FinalKeywordConstructor {


    //Final keyword deger atamadan constructor araciligiyla deger atamasini yaptik.
    public final  int number;

    public FinalKeywordConstructor(int a, int b){
       // number=123; parametre olmadan atanan deger
        number=a+b; //int parametre yani obje create ederken verilen degeri final olan bir
                 // variable degeri olarak belirledik
    }


//    public void test1(){
//        number=123;//Burada method dan final ile tanimlanmis instance variable deger ATANAMAZ
//    }


}
