package Day_36_WrapperClass;

public class _7_Methods {
    public static void main(String[] args) {

//        int[] arr=new int[9]; //9 elementli bir int dizisi
//        int[][] tablo=new int[5][]; //Satir zorunlu ama Stun zorunlu degil
//


        //Burada eger gonderilecek degerlerin sayisi belli degil ise --> parametre olarak


        notlariToplaYaz("Ahmet",60,70,45,65,90);
        notlariToplaYaz("Emre",80,50,40);
        notlariToplaYaz("Hasan",35,65);
        notlariToplaYaz("Mehmet", 50,60,30,55,85,75,45);

    }

    //type belli olan ama ayni type dan kac parametre olacagi belli degil ise uc nokta ile parametre olusturulabilir.
    //IKI KURAL:
    //1-Bir tane uc noktali parametre olabilir
    //2-Parametre de en sonda olmalidir
    public static void notlariToplaYaz(String name, int ... notler){
        int sum=0;
        for (int n : notler) {

            sum+=n;
        }
        System.out.println(name+"`nin ders notlarinin ortalamsi :"+ sum/notler.length);
    }
}
