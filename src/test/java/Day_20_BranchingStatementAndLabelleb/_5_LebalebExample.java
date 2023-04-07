package Day_20_BranchingStatementAndLabelleb;

public class _5_LebalebExample {
    public static void main(String[] args) {

      tex1:  for (int i = 0; i < 10; i++) {

          tex2:  for (int j = 0; j < 10; j++) {

                if (j==3){
                    System.out.println("j = " + j);
                    break tex2;
                }

            }

        }
          //Labelled -->
        //LaBeLEB de isim degisken kurallari cercevesinde verilebilir. Syntax olarak --> isim:
    }
}
