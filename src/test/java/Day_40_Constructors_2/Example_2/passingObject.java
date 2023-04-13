package Day_40_Constructors_2.Example_2;

public class passingObject {

    public static void main(String[] args) {
        SDET ramazanBey=new SDET("Ramazan Bey",35,'M',"Boing",12000);

        SDET guldenHanim=new SDET("Gulden Hanim",30,'F',"Airbus",13000);
        System.out.println("guldenHanim = " + guldenHanim.salary);//Method dan once
        vergiKesimi(guldenHanim);
        System.out.println("guldenHanim = " + guldenHanim.salary);


        vergiKesimi(ramazanBey);//Obje ve initilaze edilmis halde kabul ediyor



        SDET bilalBey;  //initilaze edilmemis bir obje

        //vergiKesimi(bilalBey); //Bu sekilde kabul ETMEZ!!!






    }

//Passing Object
    public static void vergiKesimi(SDET personal){
        personal.salary-=2000;

    }
}

