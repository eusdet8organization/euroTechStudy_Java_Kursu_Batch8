package Day_41_Encupsulation.Ornek1;

import java.util.Arrays;

public class Person {

    private String name;
    private int age;
    public char gender;

    //SET-->UPDATE etme ve uzerine yazma islemi yapilabilir
    //SET-->WRITE
    public void setGender(char gender) {
        if (gender=='F')
           this.gender = gender;
    }

    public void setName(String name) {
        String str = name.toLowerCase();
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
                newStr+=str.charAt(i);
        }
        if (newStr.length()==name.length())
            this.name=name;
    }
//Biz this dedigimiz yas degiskenini mutlak degerli
// bir sekilde tanimladik
    public void setAge(int age) {
        this.age = Math.abs(age);
    }

//GET ile sadece cagirmayi ve okumayi saglamis oluruz.
    //GET-->READ


    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        String flag="Person{";
        if (name!=null)
            flag+="name='" + name + '\'' ;




        return flag;


//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
    }
}
