package Day_45_Static_01;

public class Dinner {
    String name;
    String title;
    int age;
    String job;


    static int pizzaSlice=8;


    public Dinner(String name, String title, int age, String job) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.job = job;
    }

    public void takeASlice(){
        pizzaSlice--;
    }

    public void takeASlice(int count){
        pizzaSlice-=count;
    }
}
