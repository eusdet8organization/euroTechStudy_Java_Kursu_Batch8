package Day_18_NestedForLoops;

public class _5_nestedForLoopExamples {
    public static void main(String[] args) {
        //Asagidaki ciktiyi nasil elde ederiz

        //*
        //**
        //***
        //****
        //*****
        //******
        //*******

        for (int i=1; i<=7; i++ ){ // Burada satir sayisini belirledik

            for (int j=1; j<=i; j++){ // Burada ise yildiz sayisina gore dongu olusturduk //Dinamik bir sinir belirledik
                System.out.print("*");// ilk for dongusundeki satir sayisini baz aldik
            }
            System.out.println();
        }

    }
}
