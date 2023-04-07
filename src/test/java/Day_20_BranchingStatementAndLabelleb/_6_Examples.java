package Day_20_BranchingStatementAndLabelleb;

public class _6_Examples {
    public static void main(String[] args) {

        //Beklenen CIKTI
        //1 1
        //1 2
        //1 3
        //2 1
        //3 1
        //3 2
        //3 3
//
//        for (int i = 1; i <=3 ; i++) {
//
//            for (int j = 1; j <=3 ; j++) {
//
//                if (i==2 && j>=2)
//                    continue; //Continue ile yazilisi
//                System.out.println(i + " "+j);
//            }
//
//        }

      birinciDongu:  for (int i = 1; i <=3 ; i++) {

           ikinciDongu: for (int j = 1; j <=3 ; j++) {
                           System.out.println(i + " "+j);
                              if (i==2)
                                 break; //break ile yazilisi

            }

        }
    }
}
