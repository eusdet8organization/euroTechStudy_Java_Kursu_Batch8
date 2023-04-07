package Day_31_StringMethod;

public class _1_StringConcat {
    public static void main(String[] args) {
        //concat methodu iki stringi bir birine ekler

        String name="Merhaba";
        String lastName="Dunya";

        System.out.println(name.concat(lastName));
       // name=name.concat(lastName);//Name degeri degismesi icin, name deger olarak concat edilmis string degeri atanmasi gerek

       // System.out.println("name = " + name);//Beklene cikti-->name ve lastName birlestirilmis hali

        System.out.println(name.concat(" ").concat(lastName));//Burada extra bosluk ekledim

        String fullName=name.concat(lastName);
        // (name+lastName;) //Bu sekilde de ekleme yapar. FAKAT arada int almaz. O yuzden CONCAT daha verimli


        System.out.println("name = " + name);
        System.out.println("fullName = " + fullName);



    }
}
