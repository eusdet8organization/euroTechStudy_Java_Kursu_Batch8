package Day_39_ConstructorAndOOPintro.Constructor;

public class Student {
    int id;

    String name;

    String surName;

    int classsRoom;


    public Student(){

    }

    public Student(int id, String name, String surName, int classRoom){
        //Parametreli constructor create ettiniz,

        this.id=id;
        this.surName=surName;
        this.name=name;
        this.classsRoom=classRoom;
    }

}
