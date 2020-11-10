public class DemoBankAccount {

    public static void main (String[] ar){
        BankAccount b1 = new BankAccount("Rafi");
        BankAccount b2 = new BankAccount();
//        BankAccount b3 = b1;

//        double saldo = b1.getBalance();
//        System.out.println("saldo b1 :"+saldo);
//
//        b2.deposit(100.50);
//        System.out.println("Saldo b1 :"+b1.getBalance());
//        System.out.println("Saldo b2:"+b2.getBalance());

        b1.deposit(100000);
        b2.deposit(200000);
        b2.transfer(100000.0, b1);
//        b3.deposit(45.765);

//        System.out.println("saldo b1 :"+b1.getBalance());
//        System.out.println("saldo b2 :"+b2.getBalance());
//        System.out.println("saldo b3 :"+b3.getBalance());

        b1.detail();
        b2.detail();
    }
}
