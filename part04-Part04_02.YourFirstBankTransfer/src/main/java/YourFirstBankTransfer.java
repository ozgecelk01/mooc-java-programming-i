
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account hesap1=new Account("Matthews account",1000);
        Account hesap2=new Account("My account",0);
        hesap1.withdrawal(100.0);
        hesap2.deposit(100.0);
        System.out.println(hesap1);
        System.out.println(hesap2);
    }
}
