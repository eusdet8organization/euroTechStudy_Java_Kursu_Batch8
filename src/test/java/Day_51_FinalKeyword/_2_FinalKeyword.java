package Day_51_FinalKeyword;

public class _2_FinalKeyword {

    final  String name="BILAL";

    //non-static statement
    {
       final String name="GULDEN"; //Bir local final variable tanimladik
    }

    static //Static block; main den once calisir
    {
        final String name="AYSE";
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Main calisti");
        System.out.println();
    }

    public void test1(){
        final  String name="Symbat";//Bir local final variable tanimladik

    }

}


