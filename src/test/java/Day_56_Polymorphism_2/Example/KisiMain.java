package Day_56_Polymorphism_2.Example;

public class KisiMain {
    public static void main(String[] args) {
        Ogrenci ogrenci=new
                Ogrenci("Bilal","Saglam","Main","euroTech8");

        Calisan calisan=new
                Calisan("Gulden","Tazeoglu","Automation","QA");

        Kisi.kimlikOlustur(ogrenci);
        Kisi.kimlikOlustur(calisan);

        System.out.println("******************************");
        //Polymorphic olarak yazdik

        Kisi ogr=new Ogrenci("Ayse","Nur","Automation","Batch_08");

        Kisi calis=new Calisan("Ramazan","Oretmis","Automation","SDET");

        Kisi.kimlikOlustur(ogr);
        Kisi.kimlikOlustur(calis);




        Kisi kisi1=new Kisi("","","");

        Calisan kisi11=new Calisan("","","","");
        Kisi kisi12=kisi11;//polymorphic


        Kisi kisi=ogrenci;






        toplama(5,6);
    }




    public static void toplama(double a, int b){
        double toplam=a+b;
    }
}
