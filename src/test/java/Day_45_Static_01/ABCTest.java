package Day_45_Static_01;

public class ABCTest {
    public static void main(String[] args) {
        ABC s1=new ABC(); //Bir obje olusturduk, ABC class indan
        ABC s2=new ABC();

        // STATIC  keyword
        //1-Fields ile kullanildiginda sadece class ismi ile erisilme imkani olur.
        // Ve sadece class a ait degiskenlere static verebiliyoruz
        //2-Static bir method sadece static bir method cagirabilir.

        ABC.m1(); //--> burada oldugu gibi class ismi ile static method cagirdik, static main method icine
        s2.m2(); //Burada OBJE methodu cagirdi.
        //ABC.m2(); bu sekilde mstatic olmayan method u cagiramayiz


    }
}
