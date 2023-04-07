package Day_27_Input;

import java.util.Scanner;

public class _3_example {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Please enter first number : ");
        int firstNumber=sc.nextInt();

        System.out.print("Please enter second number : ");
        int secondNumber=sc.nextInt();

        //String den int e veya int den string klavyeden bilgi istendiginde veya scanner olarak tanimladigimiz class
        //alt alta veri girisi olacagi zaman, bu data type degisikliginde genellikle String icin onemli
        //String ve numeric icin ayri scanner nesnesi olusturulmasi daha sagliklidir.
        //Veya nextLine methodu calistirarak sorun giderilebilir
        sc.nextLine();
       // Scanner sc1=new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name=sc.nextLine();

        System.out.print("Please enter third number : ");
        int thirdNumber=sc.nextInt();

        System.out.println("first number : "+firstNumber+" second number : "+secondNumber+" name : "+name);
    }
}
