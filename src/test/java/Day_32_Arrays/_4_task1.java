package Day_32_Arrays;

import java.util.Scanner;

public class _4_task1 {
    public static void main(String[] args) {

        String[] days=new String[7];

        days[0]="Pazartesi";
        days[1]="Sali";
        days[2]="Carsamba";
        days[3]="Persembe";
        days[4]="Cuma";
        days[5]="Cumartesi";
        days[6]="Pazar";

        Scanner sc=new Scanner(System.in);
        System.out.println("Gun indexini yazar misiniz");
        int gunIndex=sc.nextInt();

        System.out.println("Girdiginiz index ile tanimlanan gun : "+days[gunIndex]);


    }
}
