package Day_63_Review_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spotify {
    //Bu sirketin IT takimlarindan biri olan scrum takimini kurup yazdiriniz

    public static void main(String[] args) {

        String departmentName="Spotify";

        ProductOwner po=new ProductOwner
                ("Dwight",45,'M',"Middle Product Owner",1214,280000,"IT");

        BusinessAnalayst ba=new BusinessAnalayst
                ("Umit",34,'M',"Business Analyst",9045,170000,"IT");

        ScrumMaster sm=new ScrumMaster
                ("Emine",32,'F',"Srum Lead",2311,190000,"IT");

        Tester tester1=new Tester("Ismail",25,'M',"S.QA",3214,150000,"IT");
        Tester tester2=new Tester("Gulden",22,'F',"Senior.SDET",3314,190000,"IT");
        Tester tester3=new Tester("Ayse",23,'F',"Senior.QA",5514,190000,"IT");
        Tester tester4=new Tester("Bilal",26,'M',"S.QA",3884,150000,"IT");
        Tester tester5=new Tester("Ramazan",27,'M',"S.QA",12184,160000,"IT");
        Tester tester6=new Tester("Selim",24,'M',"S.QA",3474,165000,"IT");

        Tester testers[]={tester2,tester4,tester3};

        Developers developer1=new Developers
                ("Isa",28,'M',"BE",1231,35000,departmentName,"Java");

        Developers developer2=new Developers
                ("GuldenT",28,'F',"FE",1551,35000,departmentName,"JS");

        Developers developer3=new Developers
                ("Gulden",28,'F',"BE",1266,45000,departmentName,"Python");
        Developers developer4=new Developers
                ("Ayse",28,'F',"BE",1277,55000,departmentName,"C#");

        Developers developer5=new Developers
                ("Symbat",28,'F',"FE",8831,44000,departmentName,"C++");


        Developers[] developers={developer1,developer2,developer3};

        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm,tester6); //Bir scrum team olusturduk

        scrumTeam.addDeveloper(developers);//Burada bir developer listesi ekledim
        scrumTeam.addDeveloper(developer4);//Burada tek bir developer objesi scrum takimina ekledik
        scrumTeam.addDeveloper(developer5);

        scrumTeam.addTester(testers);//Burada bir tester listesi ekledim
        scrumTeam.addTester(tester1);//Burada bir tester  ekledim
        scrumTeam.addTester(tester5);


        System.out.println("scrumTeam = " + scrumTeam);
       // System.out.println("scrumTeam.testers = " + scrumTeam.testers);


//        Scanner sc=new Scanner(System.in);
//        System.out.print("Please write your name : ");
//        String name=sc.nextLine();
//
//
//        System.out.print("Please write your job title : ");
//        String jobtitle= sc.nextLine();
//
//        System.out.print("Please write your age : ");
//        int age= sc.nextInt();
//
//
//        System.out.println("Please write your local tax");
//        double salaryWithtTax= sc.nextDouble();

//        int taxRange=0;
//        if (salaryWithtTax*taxRange>0){
//            tester1.setSalary(salaryWithtTax);
//        }else {
//            System.out.println("Please write valid tax range");
//        }
//
//
//
//        Tester test1=new Tester(name,age,'F',jobtitle,54321,salaryWithtTax,departmentName);


        System.out.println("----------------------------------------");
//        List<Tester> newList=new ArrayList<>();
//        for (Tester st:scrumTeam.testers) {
//            System.out.println(st.getName());//Burada ters pholymorphism ile teters isimlerini yazdirdik
//            System.out.println(st.getEmplyeeID());
//            newList.add(st);
//        }

//        System.out.println("newList = " + newList);
//        System.out.println(newList.size());

       List<Tester> filterListTest= scrumTeam.testers.stream().filter(user->user.getJobTitle().contains("Senior")).toList();
        System.out.println("filterListTest = " + filterListTest);

       // List<Tester> mapListDeveloper=scrumTeam.testers.stream().map(user->new Developers("Ayse",))

                //Map--> Map<K,V>

        int[][] tablo=new int[5][];


    }
}
