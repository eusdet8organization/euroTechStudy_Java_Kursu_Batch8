package Day_45_Static_01;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator obje1=new Calculator();
        System.out.println(obje1.plus(4.3,5.6)); //OBJE ile static olan bir method cagirdik
        System.out.println(Calculator.plus(4,3)); //CLASS ismi ile static olan bir method cagirdik

        int i=Integer.parseInt("33");//String olan bir sayiyi integer a cevirdi
        System.out.println(i*5);
        System.out.println(Character.isDigit('4'));//Bu ise bir char olan karakterin sayi olup olmadigini kontrol etti

//ayni sinif icerisinde obje olusturabiliyoruz.
        CalculatorTest ct=new CalculatorTest();
        //1. yontem buradaki methodu cagirmak icin
        ct.m4();// Burada bu snifa ait bir method oldugundan bu sinifin bir objesi lazim

        //2. yontem
        m4();

        //3. yontem
        CalculatorTest.m4();



    }



    public static void m4(){
        System.out.println("Geliyor yeni SDET ler");
    }
}
