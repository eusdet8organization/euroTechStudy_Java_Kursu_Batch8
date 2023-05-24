package Day_63_Review_01;

public class Developers extends Employee implements DevTeam{

    public String programingLanguage;

    //A --> tamamen makina dili olarak
    //B--> Bu yine sadece makina dili ve ayrica byte code ile gelistriliyor
    //C--> Bu dili bir univerteden prof sadelestiriyor. Daha anlasilir hale getiriyor
     //C de byte code, bazi kelimeler ile eslestiriliyor.
    //C+ ile artik hayatin icerisinde cozum uretmeye basliyor
    //Java  --> Python dili javanin sadelesmis sekli ile gelistiriliyor
    //C#
    //C++








    public Developers(String name, int age, char gender, String jobTitle, int employyeID, double salary, String department,String programingLanguage) {
        super(name, age, gender, "Developer", employyeID, salary, department);
        this.programingLanguage=programingLanguage;
    }

    @Override
    public void coding() {
        System.out.println("Developers are writing code on IDE");
        System.out.println(getJobTitle()+" "+ getName()+" is programing "+programingLanguage);

    }

    // @Override tagi yazmak zorunda degilsiniz
    public void test() {

        System.out.println("Developers write unit test");
    }


    public void fixBug(){
        System.out.println(getJobTitle()+" "+getName()+" "+ " is fixing bug");
    }
}
