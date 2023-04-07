package Day_26_ObjectAndClass_2.ornekSoru;

public class ObjeClass {
    public static void main(String[] args) {


        ElektrikHesabi elektrikHesabi=new ElektrikHesabi();
        Musteri musteri=new Musteri();
        ElektrikHesabi elektrikHesabi1=new ElektrikHesabi();
        Musteri musteri1=new Musteri();

        elektrikHesabi.oran=0.7;
        elektrikHesabi1.oran=0.67;

        int yeniOran=(int) (elektrikHesabi.oran+elektrikHesabi1.oran);

        musteri.name="Mr.Selim";
        musteri1.name="Mr.Bilal";


    }
}
