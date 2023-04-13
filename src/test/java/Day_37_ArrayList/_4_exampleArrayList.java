package Day_37_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_exampleArrayList {
    public static void main(String[] args) {
        //Bir ogretmenden istedigi kadar not aliniz ve alinan notlarin ortalamasini gecen ogrenci sayisini bulunuz

        ArrayList<Integer> notlar=new ArrayList<>();

        Scanner scNot=new Scanner(System.in); //Scanner icin bir obje tanimlar ve klavyeyi okumasini soyler
        Scanner scanner=new Scanner(System.in);

        String devamMi;//do icerisinde olursa while condition icerrisine yazamayiz, o yuzden disarda tanimladik
        int sum=0;
        do {
            System.out.println("Lutfen not giriniz :");
            int ogrNot=scNot.nextInt();//kullanicidan talep edilme islemi yani method burada yer alir.
            notlar.add(ogrNot);//Burada kullanicidan alinan notu listeye atadik

            sum+=ogrNot;

            System.out.println("Devam mi : E/H");
            devamMi=scanner.nextLine();//Buraya da devam edip etmemeyi kullanicidan aldim ve belirlenen degiskene atadim

        }while (devamMi.equalsIgnoreCase("E"));

       double ortalama=sum/notlar.size(); //Burada eleman sayisi ile not ortalamasini bulduk

        int counter=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ortalama){
                counter++;
            }
        }
        System.out.println("girilen ogr notlar = " + notlar);
        System.out.println("ortalama : "+ortalama);
        System.out.println(notlar.size()+" ogrenciden ortalamayi gecenlerin sayisi: "+counter);



    }
}
