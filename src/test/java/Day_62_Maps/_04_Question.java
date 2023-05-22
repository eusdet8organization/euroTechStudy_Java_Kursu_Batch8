package Day_62_Maps;

import java.util.*;

public class _04_Question {
    public static void main(String[] args) {
        // Kullanıcıya--Klavye
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username(key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.

        Map<String, Map<String ,String>> users=new HashMap<>();

        Scanner oku=new Scanner(System.in);
        int secim=0;

       do {

           System.out.println("***MENU****");
           System.out.println("1-Ekleme");
           System.out.println("2-Listeleme");
           System.out.println("3-Arama");
           System.out.println("4-Duzeltme");
           System.out.println("5-Silme");
           System.out.print("Seciminiz = ");
           secim = oku.nextInt();

           switch (secim)
           {
                 case 1: Ekleme(users); break;
                 case 2: Listeleme(users); break;
                 case 3: Arama(users); break;
                 case 4: Duzeltme(users); break;
//               case 5: Silme(users); break;
               default:
                   System.out.println("Yanlis sayi girdiniz");
           }


           System.out.println("Tum kullanicilar = "+users);

       }while (secim<6);





    }

    private static void Ekleme(Map<String, Map<String ,String>> users){
        Scanner sc=new Scanner(System.in);

        System.out.print("Username = ");
        String username=sc.nextLine();

        System.out.print("Password = ");
        String password=sc.nextLine();

        System.out.print("UserType = ");
        String userType=sc.nextLine();

        Map<String ,String> user=new HashMap<>();
        user.put("password", password);
        user.put("userType",userType);
        users.put(username,user);
    }

    private static void Listeleme(Map<String, Map<String ,String>> users){

        //Users ekleme biciminden sonra HashMap olarak nasil sirali duruyorsa , o sekilde kayiteder.
        Map<String, Map<String ,String>> sortUsersL=new LinkedHashMap<>(users);//Bu ayni klacak
        Map<String, Map<String ,String>> sortUsersT=new TreeMap<>(users);//Key kismi Kucukten buyuge gore
                                                                    // siralanarak saklayacak
    }

private static void Arama(Map<String, Map<String ,String>> users)
{
    Scanner oku=new Scanner(System.in);
    System.out.print("Aranan Anahtar (Key) kelimeyi giriniz =");
    String arananKelime= oku.nextLine();

    if (users.containsKey(arananKelime) ){
        System.out.println("users.containsValue(\"ahmet\") = " + users.containsValue("ahmet"));
    }
}

private static void Duzeltme(Map<String, Map<String ,String>> users){
        //Buraya bir if condition yazilarak yapilabilir.
        users.get("object").replace("StringKey","YeniDeger");


        users.get("Ahmet").put("Samet","Yenidegerverildi");//Burada ilk key(yani samet ile) ile elde edilen degerin
                                                             //yeniden eklenmesi
}

}
