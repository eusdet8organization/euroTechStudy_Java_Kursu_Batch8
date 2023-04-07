package Day_18_NestedForLoops;

public class _8_BreakForLoop {
    public static void main(String[] args) {

        for (int i=2; i<=5; i++){
            System.out.print(i);
            if (i==3){
                System.out.print("   Sihirli sayiyi buldunuz.");
                break; //icinde bulundugu for dongusunu kirar. icinde oldugu for dongusunu sonlandirir, BELIRLENEN SARTA GORE
                //SART saglanmasi durumunda BREAK oncesi herseyi compile eder yani kosar.
            }
            System.out.println();
            //en son satirda artis yada azalis oluyor.
        }
        //++i olursa cikti
        //2
        //3   Sihirli sayiyi buldunuz.
        //4
        //5

    }
}
