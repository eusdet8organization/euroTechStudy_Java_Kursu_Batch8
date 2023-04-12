package Day_39_ConstructorAndOOPintro.Constructor2;

public class Kitap {
    String author;
    int publishYear;

    String name;


    public Kitap(String author, int publishYear, String name){
        this.author=author;
        this.name=name;
        this.publishYear=publishYear;
    }


    //Bir konstructor ile olusan objenin yazdirilmasi, yazdirma methodu
    public String toString(){
        return  name+" "+publishYear+" "+author; //Bir string dondurduk
    }

}
