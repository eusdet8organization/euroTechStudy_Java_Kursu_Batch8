package Day_32_Arrays;

public class _9_findCar {
    public static void main(String[] args) {

      //  String[] cars={"Toyota", "Nissan", "BMW","Mercedes","Honda"};

        //Dizinin icerisinde "Honda" var mi sorgulayip cevaplayiniz. Ayrica Bunu nasil dinamik hale getirebilirsiniz

//        boolean flag=false;
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i].equalsIgnoreCase("Honda")){
//                flag=true;
//            }
//
//        }
//
//        if (flag){
//            System.out.println("Evet, bu marka aracimiz bulunmaktadir");
//        }else {
//            System.out.println("Bu marka aramacimiz bulunmamaktadir");
//        }
//
        String[] cars={"Toyota", "Nissan", "BMW","Mercedes","Honda"};
       boolean a= dizideArama(cars,"hONda");
        System.out.println("Bu kelime dizinin icerisinde yer aliyor mu : " +a);

    }

    public static boolean dizideArama(String[] dizi, String arananKelime){
        boolean flag=false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equalsIgnoreCase(arananKelime)) {
                flag=true;
            }
        }
        return flag;
    }
}
