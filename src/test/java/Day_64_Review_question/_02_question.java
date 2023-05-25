package Day_64_Review_question;

public class _02_question extends _01_question{
    public static void main(String[] args) {
        System.out.println("Hi");
        _01_question aa=new _02_question();
        System.out.println(aa);//Hash code:_02_question@28a418fc
        System.out.println("Last line");
    }
    //Expected Result ? = 1-Static block , 2- This main //-Hi
                                                        //- NON-STATIC
                                                        //-Last line
}
