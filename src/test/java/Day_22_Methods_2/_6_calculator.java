package Day_22_Methods_2;

public class _6_calculator {

    public static void main(String[] args) {
        calculator(45,3,"-");
        calculator(15,4,"*");
        calculator(60,3,"+"+"/"); // "+/" = "+"+"/"
    }


    public static void calculator(int num1, int num2, String operator){

        switch (operator){
            case "+" : System.out.println(num1+num2);break;
            case "-" : System.out.println(num1-num2);break;
            case "*" : System.out.println(num1*num2);break;
            case "/" : System.out.println(num1/num2);break;
            default: System.out.println("Gecersiz operator");

        }


    }
}
