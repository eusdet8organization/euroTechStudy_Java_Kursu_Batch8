package Day_35_2DArrays;

public class _7_example {
    public static void main(String[] args) {
        int[] a={1,3,2};
        int[] b={3,2,7,90,75,43};
        System.out.println(sonDeger(a,b));
    }

    public static String sonDeger(int[] x,int[] y){
        if (!(x.length>1)){ //x dizisinin uzunlugu 1 den buyuk olmama durumunda
            return "Array1 is not Valid ";
        }
        if (!(y.length>1)){ //y dizisinin uzunlugu 1 den buyuk olmama durumunda
            return "Array2 is not Valid ";
        }

        if (x[0]==y[0]  ||  x[x.length-1]==y[y.length-1]){
            return "true";
        }else {
            return "false";
        }
    }
}
