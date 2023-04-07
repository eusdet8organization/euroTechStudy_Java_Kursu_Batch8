package Day_26_ObjectAndClass_2;

public class BankAccount {

  //  instance Variable --> method ve Main icerisinde degil, Class ismini tanimlayan degiskenler
  //Method lar ise Class in fonksiyonlarini ifade eden statementlar dir.

   // CLASS icerisindeki degisken ve method lari kullanmak icin bu class a ait bir OBJE veya NESNE create etmek gerek

    double balance;
    String accountHolder;
    int accountNumber;
    //Bir deposit ve return olmayan fonksiyon Class a uygun olarak tanimladik
    public void deposit(double amount){
        System.out.println("depositing $ "+amount+ "to "+ accountNumber);
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("-----------------");
        System.out.println("Account Holder is "+ accountHolder);
        System.out.println("Account Number is "+ accountNumber);
        System.out.println("Your Account Balance :" + balance);
    }

    public static void main(String[] args) {
        //BankAccount class ina ait bir NESNE olusturduk
        BankAccount benimHesabim=new BankAccount();
        benimHesabim.showBalance(); //expected result? DEFAULT
        benimHesabim.balance=124.45;
        benimHesabim.accountHolder="Mr. Ramazan";
        benimHesabim.accountNumber=123453224;

        benimHesabim.showBalance();
        benimHesabim.deposit(100.25);

        benimHesabim.showBalance();

    }


}
