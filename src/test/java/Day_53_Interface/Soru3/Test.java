package Day_53_Interface.Soru3;

public class Test implements IGoster,IYazdir{
    @Override
    public void yaz(String message) {
        System.out.println(message + " message yazdiririldi");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
    //Ayni parametreli ve ayni isimli olan iki farkli interface sinifindan imlement edilen
    // method laran sadece biri uygulanir. Cunku ayni kurali tarif ediyor.

    @Override
    public void yaz(String message, int times) {
        System.out.println(message+times +" kere yazildi");
    }

    @Override
    public void goster() {
        System.out.println("goster");
    }
}
