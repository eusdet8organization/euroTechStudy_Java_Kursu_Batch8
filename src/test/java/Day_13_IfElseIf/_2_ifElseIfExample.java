package Day_13_IfElseIf;

public class _2_ifElseIfExample {
    public static void main(String[] args) {

       // Not dagilimi;

        // Alinan Score 100-80 arasi ---> A
        // Alinan Score 80-70 arasi ---> B
        // Alinan Score 70-60 arasi ---> C
        // Alinan Score 60-40 arasi ---> D
        // Alinan Score 40 dan daha dusuk ---> F



        int score=85;

        if(score<100){

//            if (score>80){
//                System.out.println("Ogrencinin aldigi puan A dir.");
//
//                if (score>90){
//                    System.out.println("Ogrenci A++ notu hak etti");
//                }
//            }

            if (score>60){

                System.out.println("Ogrenci C ve uzeri puan almayi hak etti");

                if (score>70){

                    System.out.println("Ogrenci B ve uzeri puanini hak etti");

                    if (score>80){
                        System.out.println("Ogrenci A ve uzeri Puanini hak etti");

                        if (score>90){
                            System.out.println("Ogrencinin puani A++ dir.");
                        }
                    }
                }

            }

        }


    }
}
