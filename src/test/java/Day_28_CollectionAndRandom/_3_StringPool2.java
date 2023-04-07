package Day_28_CollectionAndRandom;

public class _3_StringPool2 {
    public static void main(String[] args) {
        String s1="Mustafa bey";
        String s2="Mustafa bey";
        String s3="Mustafa bey";

        String yeniS=new String("Mustafa bey");

        if (s2==yeniS){
            System.out.println("Burada kaplar kiyas edilir.");
        }else {
            System.out.println("Kaplar esit degil");
        }
        /////////////////////////
        if (s2.equals(yeniS)){
            System.out.println("Burada kab icerisindeki degerler kiyaslanir");
        }else {
            System.out.println("Degerler esit degil");
        }


    }
}
