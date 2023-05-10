package Day_56_Polymorphism_2.Example;

public class Kisi {
    private  String name;
    private String soyad;
    private String gorev;

    public Kisi(String name, String soyad, String gorev) {
        this.name = name;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    //Methodun parametresinde-->Kisi dataType olan Kisi class indan bir obje olusturduk
    public static void kimlikOlustur(Kisi kisi)//Buradaki parametre direkt bir OBJE craete eder
    //kisi=new Ogrenci(); --> Kisi kisi=ogrenci; ogrenci --> Dort parametresi olan bir obje
    //kisi=new Calisan(); -->Kisi kisi=calisan;
    {
        //(Kisi kisi) parametre --> Kisi kisi=new Kisi();
        //Constructor dan gelen Kisi deki instance variable degerlerini yazdirdik
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.soyad = " + kisi.soyad);
        System.out.println("kisi.gorev = " + kisi.gorev);

        //gelen kisi ogrenci ise
        if (kisi instanceof Ogrenci){
            System.out.println("Sube ="+((Ogrenci) kisi).getSube());//Cast yapilarak kisi objesi Ogrenci objesine donusturuldu
        }

        //gelen kisi Calisan ise
        if (kisi instanceof  Calisan){
            System.out.println("Depatman ="+((Calisan) kisi).getDepartman());
        }


    }















    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
