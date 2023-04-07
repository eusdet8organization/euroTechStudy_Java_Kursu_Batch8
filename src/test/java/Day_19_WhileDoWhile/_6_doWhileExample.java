package Day_19_WhileDoWhile;

public class _6_doWhileExample {
    public static void main(String[] args) {
        
        int i=0;
        int m=6;
        
        do { // While satrina kadar olan statement kismini sarta bakmaksizin kosar

            m=m*2; // m*=2; bu sekilde yazilabilir
            System.out.println("m = " + m);
            i++;
        }while (i<=5);  // ^ kez kosmasi bekleniyor
        
    }
}
