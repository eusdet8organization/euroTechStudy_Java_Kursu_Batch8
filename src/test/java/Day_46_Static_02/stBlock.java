package Day_46_Static_02;

public class stBlock {
    private String city;

    static String country;
//Tum statement lardan once calisir. Main den de once kosar
//Class icerisinde hicbir access modifry almadan yazlir
    static {
        System.out.println("static blok-1 calisti");
        country="USA";
    }

    stBlock(String city){
//        this.city=a;
        System.out.println("Constructor calisti");
        this.setCity(city);//encapsulation uygun bir hale geldi
        //Data hiding yapmis olduk
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    static {
        System.out.println("static blok-2 calisti");
        country="UK";
    }

}
