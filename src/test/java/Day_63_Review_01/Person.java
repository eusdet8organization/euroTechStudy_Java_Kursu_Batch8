package Day_63_Review_01;

public abstract class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }


    //Set parametre ile atanir, return type olmadan yazilir
    public void setName(String name){
        if (name.contains(" ")){  //Yani bir isim var  --> Ahmet Emre -->Arada bosluk var
            this.name=name.split(" ")[1];//boldugunde 0 index ine karsilik gelen Ahmet, 1 indexine karsilik gelen Emre
        }else
        this.name=name;

    }

    //Burada return type ile yazildi
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
          if (age>18)
            this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='F' || gender=='M')
                this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
