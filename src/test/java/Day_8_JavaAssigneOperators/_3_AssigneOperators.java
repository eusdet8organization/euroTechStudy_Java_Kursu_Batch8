package Day_8_JavaAssigneOperators;

public class _3_AssigneOperators {
    public static void main(String[] args) {

        int sayac=0;
        sayac++;  // sayac -> 1 oldu
        sayac--;  // sayac tekrar -> 0 oldu
        
        System.out.println("sayac = " + sayac); //sayacin degeri degismedi

        sayac=sayac+4;  // dort ekledi
        System.out.println("sayac = " + sayac);

        sayac+=4; // sayaca dort ekledi   sayac degeri 8 oldu
        System.out.println("sayac = " + sayac);
        
        sayac-=4; // sayac dort azaldi yani sonuc 4
        System.out.println("sayac = " + sayac);





        int valt=42;

        --valt; // valt 41

        System.out.println("valt = " + --valt); // consol value= 40

        System.out.println("valt = " + valt--); // consol value =40
         // Bu satirda valt degeri 39

        valt +=5; // valt 44

        System.out.println("valt = " + ++valt); // colsol degeri -> 45





        int rakam = 21;

        System.out.println(rakam+5);





        
        


    }
}
