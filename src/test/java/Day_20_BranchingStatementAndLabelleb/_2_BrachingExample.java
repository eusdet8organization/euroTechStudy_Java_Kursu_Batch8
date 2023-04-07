package Day_20_BranchingStatementAndLabelleb;

public class _2_BrachingExample {
    public static void main(String[] args) {

        int counter=10;

        while (true){

            if (counter==0){
                System.out.println("Dongu burada tamamlandi, Sonsuz donguden ciktik");
                System.out.println("counter = " + counter);
                break;
             //   System.out.println("Dongu devam edebilir mi ? ");
                //Break kendisinden sonra yazilan statement okumaz. O yuzden sartin yazildigi if icerisinde kendisinden sonra yazilana
                //hata doner.
            }
            System.out.println("counter = " + counter);

            counter--;
        }

    }
}
