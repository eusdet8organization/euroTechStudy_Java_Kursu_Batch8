package Day_39_ConstructorAndOOPintro;

public class TlhBank1 {

    public static void main(String[] args) {

        TlhBank1 tninBankaHesabi1=new TlhBank1(); //TlhBank1() --> Bir nesne create edilme sirasinda
                                                  //automatic olarak kullanilan method dur.


    }



    //Bir parametresiz konstractor create ettik
    //Class ismi ile AYNI olmak zorundadir.
    //RETURN Type(int, string, void..) yoktur.
    //CONSTRUCTOR LAR PARAMETRELI VEYA PAREMETRESIZ olabilirler. Yazilmadiginda GIZLI olarak calisir.
    //CLASS icerisinde bir kez olusturulur. Tum objeler ayni constructori kullanbilir
    public TlhBank1(){

    }



    public void TlhBank1(){
        //BU BIR CONSTRUCTOR DEGILDIR, BIR METHOD DUR!!!
    }









}
