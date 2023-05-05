package Day_48_inheritance_012.superKeyword;

public class Dog extends Animal{
    int eyes;
    int legs;
    int teeth;
    int nectSpot;

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }


    public Dog(int eyes, int legs, int teeth, int nectSpot){
        super("Lessi",1,1,8,20);//Deger atanarak cagrildi
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.nectSpot=nectSpot;
    }


    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", brain=" + getBrain() +
                ", body=" + getBody() +
                ", size=" + getSize() +
                ", weight=" + getWeight() +
                '}'+
                "Dog{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                ", teeth=" + teeth +
                ", nectSpot=" + nectSpot +
                '}';
    }

    //Constructer li olan bir class asagida old. gibi constructer create edilerek extend edilebilir
//Bu class objesi icin bir constructer olusturduk. Yani 9 fields lazim bir obje icin
//Bu super class in EXTENDS edilme islemi icin bir constructur cagrildi.
//    public Dog(String name, int brain, int body, int size, int weight) {//bu super classin fields leri
//        super(name, brain, body, size, weight);//Super class dan gelenler
//    }
//  Dog(int eyes, int legs, int teeth, int nectSpot){
//      super("Lessi",1,1,8,20);//bir extends edilen class dan OBJE
//                                                          //create etmek gibi constructer SUPER
//                                                           //kullandik
//  }













}
