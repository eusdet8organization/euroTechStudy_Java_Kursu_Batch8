package Day_41_Encupsulation.Example;

public class Ogrenci {
    private int okulNo;
   private String ad;
   private String soyad;
   private int yas;
   private static int ID=1;
    public Ogrenci(String ad, String soyad, int yas) {
        this.setAd(ad);         //this.ad = ad;
        this.setSoyad(soyad);   //this.soyad = soyad;
        this.setYas(yas);       //this.yas = yas;
        this.getOkulNo();
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>15){
            System.out.println("15 yasindan buyuk olamaz");
        }else {
            this.yas = Math.abs(yas);
        }

    }
}
