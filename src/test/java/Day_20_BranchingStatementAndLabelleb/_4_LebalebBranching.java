package Day_20_BranchingStatementAndLabelleb;

public class _4_LebalebBranching {
    public static void main(String[] args) {
        // ic ice dongulerde BREAK ve CONTINUE kavramlarinin calisma bicimi

        int i=0;
        //Nested dongu soz konusu oldugunda hangi dongu icin gecerli olacak BREAK ve CONTINUE


        outer:  do { // ilk statement sartsiz kosar. Do while icin
                   i=8;

                  inner:  while (true){  // inner ve outer kavramlari sabit degil. Dilediginiz ismi verebilirsiniz
                                        // degisken isim verme kurallari gecerli


                     System.out.println("i-- = " + i--);
                      if (i==4){
                         int toplam=i+5;
                         System.out.println("toplam = " + toplam);
                          break outer; //Buraya yazdiginiz dongu icin gecerli olacak.
                      //Eger tanimlanmazsa //Burada icinde bulundugu donguyu baz alir. Ancak dis dongu ile tekrarlanir.

                }
            }
        }while (true);

        // !!!! ic ice loop larda Braching yani Continue ve Break hangi dongi dongu gecerli oldugunu tanimlamak gerekir
    }
}
