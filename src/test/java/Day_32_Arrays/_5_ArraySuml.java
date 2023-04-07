package Day_32_Arrays;

public class _5_ArraySuml {
    public static void main(String[] args) {
        int[] sayilar=new int[6];

        sayilar[0]=3;
        sayilar[1]=4;
        sayilar[2]=12;
        sayilar[3]=24;
        sayilar[4]=11;
        sayilar[5]=5;

        int sum=(sayilar[0]+sayilar[1]+sayilar[5]+sayilar[4])/3;
        System.out.println("Dizideki dort sayinin toplaminin uce bolumu : "+sum);
    }
}
