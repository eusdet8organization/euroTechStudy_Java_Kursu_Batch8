package Day_54_Inheritance_Composition_Example;

public class Akbank extends Bank{
    public Akbank(double currentBalance, String accountType) {
        super(currentBalance+120, accountType);
        Bonus(getAccountType());
    }

    public void Bonus(String accountType){
        switch (accountType){
            case "GOLD" :
                setDepositeBonus(80);
                setWithdravExpence(70);
                setReturnRate(1.3);
                break;
            case "SAVING" :
                setDepositeBonus(90);
                setWithdravExpence(60);
                setReturnRate(1.2);
                break;
            case "INTEREST" :
                setDepositeBonus(100);
                setWithdravExpence(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("GECERSIZ HESAP TURU");
                break;

        }

    }


    @Override
    public void deposite(double depositeValue) {
        if (depositeValue<2000) {//2000 den az olma durumunda herhangi bir degisiklik olmadigi icin, yatirilan degeri super e gonderdik
            super.deposite(depositeValue);
        }else {//deposite Value >=2000 demektir
            super.deposite(depositeValue+getDepositeBonus());

        }
    }


    @Override
    public void withdraw(double withdrawValue) {
        if (withdrawValue<1000){
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue + getWithdravExpence());//Burada kesinti ucreti ile cekilen miktar
        }                                                                  // balance dan cikarildigi icin(islem ucreti ile birlikte)
    }
}
