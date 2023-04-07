package Day_13_IfElseIf;

public class _4_ExampleParantez {
    public static void main(String[] args) {
        int score=45;
        //****************       Parantez   ****************************
        if (score==20) {
            score += score;
            int toplam = score++;
        } else if (score<46) { // Eger else ile birlikte direkt
            // olarak if kullanilacak ise suslu Parantez gerek yoktur.
            System.out.println("*************");

        }

//                    }else {
//                        score-=3;
//                        if (score==12){
//
//                        }
//                    }if (score>35)
//                      System.out.println();

    }
}
