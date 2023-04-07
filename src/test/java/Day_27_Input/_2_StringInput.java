package Day_27_Input;

import java.util.Scanner;

public class _2_StringInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir String verisi giriniz : ");
        String tex=sc.nextLine();//toString degil de nextLine olarak kullanilmasi daha genis kullanim hakki verir

        System.out.println("tex = " + tex);


    }
}
