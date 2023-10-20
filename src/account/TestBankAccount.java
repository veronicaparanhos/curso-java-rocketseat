package account;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setNumber("1234");
        account.setName("Verônica");

        account.deposit(150);
        account.withdraw(100);
    }
}
