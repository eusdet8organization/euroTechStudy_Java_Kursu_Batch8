package Day_36_WrapperClass;

public class _4_exampleWrapper {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

        //Alphabetic degerleri bir yeni stringe atayip yazdiriniz. Lutfen method kullaniniz

        System.out.println("newLetter(str) = " + newLetter(str));
    }

    public static String newLetter(String s){
        String newStr="";
        System.out.println("newStr = " + newStr);
        for (int i = 0; i < s.length(); i++) {

            if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' '){
                //newStr = ""+'W'+'e'+...
                newStr+=s.charAt(i); //Burada bir stringe onune veya arkasina eklenen char int her neyse string olarak
                                          //ekleme yapar
            }

        }
        return newStr; //newStr=Welcome to core Java
    }
}
