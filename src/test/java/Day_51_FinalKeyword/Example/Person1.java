package Day_51_FinalKeyword.Example;

public class Person1 {

    String name;

    final int tcNumber;
    static int tcNo=10000001;

    public Person1(String name) {
        this.name = name;
        this.tcNumber=tcNo++;

    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' + "Tc Numarasi : "+tcNumber+
                '}';
    }
}
