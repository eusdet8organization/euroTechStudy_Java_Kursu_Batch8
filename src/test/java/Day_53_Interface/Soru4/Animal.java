package Day_53_Interface.Soru4;

public interface Animal {
    String food();
    //normalde interface classinda method BODY olmadan ve DEFAULT ABSTRACT olur

    //Bir istista DISINDA, java-8 ile gelistirilen ve iki keyword ile,
    // interface method lara BODY EKLEME firsati verdi.
    //DEFAULT veya STATIC kavramlari eklenerek yazilabilir hale geldi

    public default int yas(){//Buradaki DEFAULT acces modifyr DEGIL
        return 5;
    }
    static int yas1(){
        return 5;
    }

    //Bu statement ile yazilan method lar, implement edilen class lar da
    // override edilme zorunlulugu yoktur
}
