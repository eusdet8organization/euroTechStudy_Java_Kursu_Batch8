package Day_13_IfElseIf;

public class _3_IfElseStatement {
    public static void main(String[] args) {

        // Burada ic ice if degerlerinin yaninda DEGUILI olan kisim icin
        // bu if sartlarinin eklenme durumuna
        // if-else-if-else akisi veya nested olarak tanimlanir.

        int score=40;

        if (score>=90){
            System.out.println("Score A ");
        } else // 90 puani ve uzeri disindaki tum alinan puanlari tanimlar.
            if (score >= 80) {  // 80 den 89 a kadar alinan puani ifade eder.
                System.out.println("Score B");
            } else //80 puani ve uzeri disindaki tum alinan puanlari tanimlar.
                if (score>=70) {
                    System.out.println("Score C");

            } else //70 puani ve uzeri disindaki tum alinan puanlari tanimlar.
                if (score>=60) {
                    System.out.println("Score D");

                }else  //60 puani ve uzeri disindaki tum alinan puanlari tanimlar.
                    if (score>=50){
                        System.out.println("Score E");
                    }else {
                        System.out.println("Basarisiz");
                    }



    }




}



