package Day_50_AccessModifiry.AccessModifires_1;

public class A1 {
    private int sayi=5;
    private String name="ismet";

    public A1() {

        System.out.println("Default Constructor calisti");

    }





    A1(int sayi) {
       this.setSayi(sayi);
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        if (sayi>=0)
           this.sayi = sayi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>0)
            this.name = name;
    }

    private int test(){
        sayi=23+12; //Private olmasina ragmen class icerisinde erisebiliyorum

       return Math.max(sayi,45);
    }

//    public static void main(String[] args) {
//        sayi=12;
//    }
}
