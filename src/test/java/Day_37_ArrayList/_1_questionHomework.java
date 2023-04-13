package Day_37_ArrayList;

import java.util.Random;

public class _1_questionHomework {
    public static void main(String[] args) {
        /*
        Sıra sayısına göre (0'dan başlayarak) her diziden bir karakter seçerek aşağıdaki ifadedeki
        gizli anahtarı bulan bir yöntem yazın.
        findSecretKey("Bazen", "kederler", "sessiz", "degisiklik", "yapmk",
        "kismetsizliginde", "ıslanmak", "istemezsler");
         */
       String anahtarKelime= findSecretKey("Bazen", "kederler", "sessiz", "degisiklik", "yapmk",
                "kismetsizliginde", "ıslanmak", "istemezsler");

        System.out.println("Sampiyon " + anahtarKelime);

//        String[] arr={"Bazen", "kederler", "sessiz", "degisiklik", "yapmk",
//                "kismetsizliginde", "ıslanmak", "istemezsler"};


    }

    public static  String findSecretKey(String... str){//String... bir diziyi ifade eder.
        String keyWord="";
        for (int i = 0; i < str.length; i++) {
            Random rd=new Random();//Eger kelimedeki harfleri random olarak belirlemek istersek
            int indexForChar=rd.nextInt(str[i].length());
            keyWord+=str[i].charAt(indexForChar);
                                    //Bu srt[i] dizideki i ninci eleman : bu elemanin i ninci karakterini
                                     // ise o elemnin charAt(i) ile alacagiz--> str[i].charAt(i)
        }
        return keyWord;
    }
}
