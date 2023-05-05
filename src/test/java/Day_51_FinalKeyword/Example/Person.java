package Day_51_FinalKeyword.Example;

public class Person {
    private String name;

    private final int tcNo;

    public Person(int tcNo) {
        this.tcNo = tcNo;
        //Encapsulation not implement
        //this.setTcNo(tcNo) kabul etmiyor
        //Cunku statement yazilabiliyor
        //update oluyor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTcNo() {
        return tcNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
