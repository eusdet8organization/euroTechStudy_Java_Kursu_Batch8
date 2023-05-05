package Day_53_Interface.Soru3;

public interface IYazdir {
    //overloading olarak methodlar yazilabilir
    void yaz(String message);

    void yaz();

    void yaz(String message, int times);
}
