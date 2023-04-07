package Day_12_ifStatement;

public class _3_ifExercises {
    public static void main(String[] args) {

        //18 yas ve uzeri olanlar oy kullanabilir kosulunu yazdiriniz.

        int age;
        age=23;

        if (age<18 || age==18) // hem veya kosulu ile sart yazdik
            System.out.println("Oy Kullanabilirsiniz");  // if kosulu sonrasi tek satir yazilacaksa suslu paranteze gerek yok
                                                        // suslu parantez olmadan birden fazla satir yazarsaniz; sadece ilkini okur

/*
            age = 45;
            System.out.println(age);
            System.out.println("Ikinci satiri yazamayiz");



 */

    }
}
