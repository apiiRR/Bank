public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(){
        balance = 0;
        name = "Account Name";
    }

    public BankAccount(String name){
        balance = 0;
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit ( double amount) {
        balance = balance + amount;
    }

    public void deposit (int amount){
        balance = balance + amount;
    }

    public void deposit (int amount, double tax){
        balance = balance + amount - tax;
    }

    public void detail () {
        System.out.println("Nama akun bank : "+name);
        System.out.println("Jumlah saldo : "+balance);
    }

    public void transfer (double amount, BankAccount destination){
        destination.deposit(amount);
        balance -= amount;
    }

}
