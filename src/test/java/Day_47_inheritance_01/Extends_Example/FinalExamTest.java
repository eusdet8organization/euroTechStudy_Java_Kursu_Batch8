package Day_47_inheritance_01.Extends_Example;

import java.util.Scanner;

public class FinalExamTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soruSayisi;
        int yanlislar;

        System.out.print("Final sinavinda toplam kac soru vardi = ");
        soruSayisi= sc.nextInt();

        System.out.print("Final sinavinda toplam kac yanlisin vardi = ");
        yanlislar= sc.nextInt();

        FinalExam final1=new FinalExam(soruSayisi,yanlislar);
        System.out.println(final1.getGrade());
    }
}
