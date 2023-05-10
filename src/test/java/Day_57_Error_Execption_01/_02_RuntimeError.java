package Day_57_Error_Execption_01;

import java.util.Scanner;

public class _02_RuntimeError {
    public static void main(String[] args) {

//
//        String sbc=null;
//        sbc.substring(2,4);




        Scanner sc=new Scanner(System.in);

        System.out.println("1. Sayiyi Giriniz : ");
        int a= sc.nextInt();

        System.out.println("2. Sayiyi Giriniz : ");
        int b= sc.nextInt();

        System.out.println(a/b);
    }
}
