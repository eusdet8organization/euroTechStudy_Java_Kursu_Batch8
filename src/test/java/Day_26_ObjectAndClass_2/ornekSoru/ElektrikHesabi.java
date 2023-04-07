package Day_26_ObjectAndClass_2.ornekSoru;

public class ElektrikHesabi {
    //fields : toplamTuketim, oran(double), OdenecekTutar

    double toplamTuketim;
    double oran;
    double odenecekTutar;
    String eletrikHesabi;

//    public static void main(String[] args) {
//
//        Musteri musteri=new Musteri();//Bir musteri nesnesi olusturdum
//
//
//    }

    //Bir method sadece yazdirilacak ise VOID olarak create edilir
    public void tuketimYazdir(){
        odenecekTutar=toplamTuketim*oran;
        System.out.println("odenecekTutar = " + odenecekTutar);
    }
}

