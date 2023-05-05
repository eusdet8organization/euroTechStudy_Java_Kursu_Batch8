package Day_44_Encapsulation_2;

public class PrinterTest {
    public static void main(String[] args) {
        Printer yazici=new Printer();
        //toplam(4,6);


        Printer yazici2=new Printer(false,65);
        System.out.println("Toner Level = "+yazici2.getTonerLevel());

        System.out.println("toplam(yazici2.getTonerLevel() =65 ,12)  : " + toplam(yazici2.getTonerLevel(), 12));

        System.out.println("yazici2.printPages(25) = " + yazici2.printPages(25));
        System.out.println("yazici2.printPages(15) = " + yazici2.printPages(15));
        System.out.println("yazici2.getPagePrinted() = " + yazici2.getPagePrinted());


    }


















    public static int toplam(int a,int b){
        return a+b;
    }

}
