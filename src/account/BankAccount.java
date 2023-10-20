package account;

public class BankAccount {
    private String number;
    private String name;
    private double balance;

    //Getter e Setter
    public BankAccount() {
        balance = 0.0;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void deposit(double value) {
        if(value > 0) {
            balance = balance + value;
        System.out.println("Déposito de R$ " + value + ". Saldo atual R$ " + balance);
        } else {
            System.out.println("O valor é inválido");
        }
    }

    void withdraw (double value) {
        if(value > 0 && value <= balance) {
            balance = balance - value;
            System.out.println("Saque de R$ " + value + ". Saldo atual R$ " + balance);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}

