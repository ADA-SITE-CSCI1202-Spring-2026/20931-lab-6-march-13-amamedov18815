public class Main {
    public static void Main(String[] args) {

        Account acc = new Account(1001, "Adil", 500);

        acc.deposit(200);

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + acc.getBalance());
    }
}