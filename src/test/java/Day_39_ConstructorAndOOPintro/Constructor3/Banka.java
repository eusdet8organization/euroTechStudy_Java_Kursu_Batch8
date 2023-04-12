package Day_39_ConstructorAndOOPintro.Constructor3;

public class Banka {
    String adi;
    int sbeSayisi;
    int kurulusYili;
    int balance;
    String userName;
    public Banka(String adi, int sbeSayisi, int kurulusYili, int balance, String userName) {
        this.adi = adi;
        this.sbeSayisi = sbeSayisi;
        this.kurulusYili = kurulusYili;
        this.balance = balance;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", sbeSayisi=" + sbeSayisi +
                ", kurulusYili=" + kurulusYili +
                ", balance=" + balance +
                ", userName='" + userName + '\'' +
                '}';
    }
}
