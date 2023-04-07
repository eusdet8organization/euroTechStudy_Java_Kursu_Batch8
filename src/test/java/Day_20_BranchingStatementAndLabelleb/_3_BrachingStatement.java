package Day_20_BranchingStatementAndLabelleb;

public class _3_BrachingStatement {
    public static void main(String[] args) {
        int sayi=0;
        int number=0;

        while (sayi<=10){
            System.out.println("number = " + number);
            number=number+sayi;
            if (number>=45){
             //   break;
             //   continue;  her ikisi icin de kendinden sonraki Statement okumuyor.
                System.out.println("number = " + number);
                System.out.println("sayi = " + sayi);
            }
        }
    }
}
