package Day_26_ObjectAndClass_2;

public class CarObject {

    public static void main(String[] args) {

        BMW b1=new BMW(); //Burada nesne b1 dir.

//        System.out.println(b1.marka);
//        System.out.println(b1.price);

        BMW b2=new BMW(); //Burada ikinci bir nesne olusturduk -->b2
        /*
        Beklenen cikti
         */
        //aracin markasi
        //aracin modeli
        //aracin fiyati
        //Yakiti elektrikli mi cevabi yazdir
    //-->!!!!!!    b1.showPrice(); --> Burada switch case icin bir deger atanmazsa, hata verir.
        //Cunku tanimli veya tanimsiz bir degeri olmasi gerekir. Yoksa okumaz ve null degerine hata verir

//        System.out.println("Arabanin markasi = " + b1.marka);
//        b1.model="x1";
//        System.out.println("Arabanin modeli ="+b1.model);
//        b1.showPrice();//Fiyat icin yazdigim methodu cagirdim
//
//        if (b1.aracElektrikliMi) {
//            System.out.println("Arac elektriklidir.");
//        }else
//            System.out.println("Arac eketrikli degildir");

           /*
        Beklenen cikti
         */
        //aracin markasi
        //aracin modeli
        //aracin fiyati
        //Yakiti elektrikli mi cevabi yazdir


        System.out.println("*******************************B2********************");

        BMW b3=new BMW();
        System.out.println("Suheda hanimin aracinin markasi : "+b3.marka);
        b3.model="Camry";
        System.out.println("Suheda hanimin aracinin modeli : "+b3.model);
       // System.out.println("Suheda hanimin aracinin fiyati : "+b3.price);
        b3.showPrice();
        b3.aracElektrikliMi=true;
        System.out.println("Suheda hanimin araci elektrikliMi : "+b3.aracElektrikliMi);





    }

}
