package Day_41_Encupsulation.Ornek1;

import Day_41_Encupsulation.Ornek1.Person;

public class PersonTest {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Albert");
        p1.setAge(25);
        p1.setGender('F');
        System.out.println("p1 = " + p1);
       // System.out.println(p1.setName(););


        Person p2=new Person();
        p2.setName("87656AB98");
        p2.setAge(-25);
        p2.setGender('M');
        System.out.println("p2 = " + p2);


    }
}
