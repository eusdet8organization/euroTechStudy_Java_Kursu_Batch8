package Day_39_ConstructorAndOOPintro.Constructor;

public class Okul {
    public static void main(String[] args) {

        //ontem 1 -->Direkt constructor parametreli tanimlanarak OBJE create ettik
        Student ogr=new Student(1234223,"hasan","karayel",5);
        System.out.println(ogr);//Direkt yazdirilamiyor. Bir method ihtiyaci var


        //yontem 2 -->En classic obje olusturma methodu
        Student st=new Student();
        st.name="ismet";
        st.surName="gns";
        st.id=21433;
        st.classsRoom=3;

        cretaStudent(5476,"ahmet","dogan",6);//Method ile bir student objesi create ettik


    }

    //ontem 3 -->Method yardimi ile instance variable tanimladik
    public static Student cretaStudent(int id, String name, String surname, int classRoom){
        Student student=new Student();

        student.classsRoom=classRoom;
        student.id=id;
        student.surName=surname;
        student.name=name;

        return student;
    }


}
