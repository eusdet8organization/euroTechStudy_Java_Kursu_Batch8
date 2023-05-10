package Day_57_Error_Execption_01;

public class _03_TryCatch {
    public static void main(String[] args) {


        System.out.println("HTADAN ONCE !!!");
        String aa="";


        try {//Dene,  hatanin baslama ihtimali olan yerin yerin ustune konur
            //HATA
            aa.substring(1,3);
            System.out.println(1 /(1-1));
        }//hatanin oldugu zaman programin kirilmasini engellemek

        catch (Exception e){//Hata isimli degiskende hatanin bilgisini verir
            System.out.println("Burada hata olustu");
        }

        System.out.println("HATADAN SONRA");





    }
}
