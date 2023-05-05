package Day_48_inheritance_012.ornek_2;

public class Person {
    String name;
    int age;
    char gender;//cinsiyet

    public void eat(String food){
        System.out.println(name+" is eating "+ food);
    }
    public void walk(){
        System.out.println(name +" is walking");
    }
    public void  sleep(int hours){
        System.out.println(name+" is sleeping for "+hours+" hours");
    }
}
