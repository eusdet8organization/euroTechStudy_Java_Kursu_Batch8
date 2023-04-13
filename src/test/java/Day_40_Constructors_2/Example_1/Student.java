package Day_40_Constructors_2.Example_1;

public class Student {

    int ogrNumber;
    String ogrName;
    String ogrSurname;
    int ogrLevel;
    boolean aktifMi;

    public Student(){
        System.out.println("Nesne olusturuldu");
    }

//
//
//    public Student(int ogrNumber,String ogrName, String ogrSurname, int ogrLevel, boolean aktifMi){
//        //this.ogrNumber instince variable. Yani class tan gelen degisken
//        //ogrNumber-->this.ogrNumber esitlenen ise, parametreden gelen degisken
//        //isim benzerligi nedeniyle karismasin diye this kullanilir
//        //Generate den otomatik yazmak icin, bir de genellemede kullanacagimiz icin
//        this.ogrNumber=ogrNumber;
//        this.ogrName=ogrName;
//        this.ogrSurname=ogrSurname;
//        this.ogrLevel=ogrLevel;
//        this.aktifMi=aktifMi;
//
//    }
//
//    public Student(int ogrNumber,String ogrName, String ogrSurname, int ogrLevel){
//
//       this(ogrNumber,ogrName,ogrSurname,ogrLevel,false);
//
//    }
//    public Student(int ogrNumber,String ogrName, String ogrSurname){
//
//       this(ogrNumber,ogrName,ogrSurname,0,false);
//
//    }
//    public Student(int ogrNumber){
//
//    this(ogrNumber,"","",0,false);
//
//    }
//

   // this() --> bu sytex ile Constructor methodunu cagirabiliyoruz.
    //This tekrarlarini ortadan kaldirir
    //Tek bir this() ile parantez icine tum parametreleri girerek ve olmayan parametrelerin DEFAULT degerini atiyoruz



    //SIMDI generate kullanarak overloading yapalim
    public Student(int ogrNumber, String ogrName, String ogrSurname, int ogrLevel, boolean aktifMi) {
        this.ogrNumber = ogrNumber;
        this.ogrName = ogrName;
        this.ogrSurname = ogrSurname;
        this.ogrLevel = ogrLevel;
        this.aktifMi = aktifMi;
    }
    public Student(int ogrNumber, String ogrName, String ogrSurname, int ogrLevel) {
        this.ogrNumber = ogrNumber;
        this.ogrName = ogrName;
        this.ogrSurname = ogrSurname;
        this.ogrLevel = ogrLevel;
    }
    public Student(int ogrNumber, String ogrName, String ogrSurname) {
        this.ogrNumber = ogrNumber;
        this.ogrName = ogrName;
        this.ogrSurname = ogrSurname;
    }
    public Student(int ogrNumber) {
        this.ogrNumber = ogrNumber;
    }

    //Birinci yontem ile Ogrenci ozellikleriyle create etme
    public static Student createStudent(){
        //ArrayList<Student> ogrListesi=new ArrayList<>();
        Student ogr1=new Student();
        // Student ogr2=new Student();

        ogr1.aktifMi=true;
        ogr1.ogrLevel=3;
        ogr1.ogrName="Ahmet";
        ogr1.ogrSurname="Bayrak";
        ogr1.ogrNumber=100342;

        return ogr1;
    }





}
