package Day_52_Abstraction.Example_3;

public abstract class Sekil {
    static int uzunluk;//--> Static olan class variable toString methodunda generate ile cagrilmaz, manuel eklenir
    private String name;

    Sekil(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    abstract double alan();
    abstract double cevre();

    public void ciz(){
        System.out.println(name+ " Sekli cizildi");
    }

//    @Override
//    public String toString() {
//        return "Sekil{" +
//                "name='" + name + '\'' +
//                "alan hesaplama='" + Math.round(alan()) + '\'' +
//                "cevre hesaplama='" + Math.round(cevre()) + '\'' +
//
//
//                "uzunluk='" + uzunluk + '\'' +
//                '}';
  //  }


    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan sonucu='" + Math.round(alan()) + '\'' +//Burada abstrac olan bir methodun sonucunu torStringe ekledim
                "cevre sonucu='" + Math.round(cevre()) + '\'' +//Burada abstrac olan bir methodun sonucunu torStringe ekledim


                "uzunluk='" + uzunluk + '\'' + //static olan bir variable torStringe ekledim
                '}';
    }
}
