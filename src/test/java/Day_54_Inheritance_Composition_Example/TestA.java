package Day_54_Inheritance_Composition_Example;

public class TestA {
    public static void main(String[] args) {
        //Bank b1=new Bank(-5,"saving");


        Akbank ismetBankaHesabi=new Akbank(1000,"saving");
        System.out.println("ismetBankaHesabi.getCurrentBalance() = " + ismetBankaHesabi.getCurrentBalance());
        System.out.println("ismetBankaHesabi.getDepositeBonus() = " + ismetBankaHesabi.getDepositeBonus());

        Karabank ismetBankHes2=new Karabank(1120,"gold");
       // System.out.println("ismetBankHes2.getAccountType() = " + ismetBankHes2.getAccountType());
        System.out.println("ismetBankHes2.getCurrentBalance() = " + ismetBankHes2.getCurrentBalance());
        System.out.println("ismetBankHes2.getDepositeBonus() = " + ismetBankHes2.getDepositeBonus());


        ismetBankaHesabi.deposite(2000);
        ismetBankHes2.deposite(1200);

        ismetBankaHesabi.withdraw(3150);
        ismetBankHes2.withdraw(2000);

    }
}
