package ExercisesAdvJava.Lesson_6.Prac_2;

public class Main {

    public static void main(String[] args) {
        BankOperations bank = new Bank();
        initializeCustomers(bank);

        // run the customer report
        bank.generateReport();
    }

    private static void initializeCustomers(BankOperations bank) {
        Customer customer;
// Create several customers and their accounts
        bank.addCustomer("Lily", "Fuma",Branch.LA);
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Enju", "Saion-ji", Branch.Boston);
        customer = bank.getCustomer(1);
        AccountOperations acct1 = new SavingsAccount(500.00);
        customer.addAccount(acct1);
        acct1.deposit(500);

        bank.addCustomer("Hotaru", "Kokonohi", Branch.Mumbai);
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Akari", "Hanao", Branch.Bangalore);
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Oka", "Kazamatsuri", Branch.LA);
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Myu", "Momochi",Branch.Bangalore);
        customer = bank.getCustomer(5);
        AccountOperations acct5 = new CheckingAccount(100.00);

        customer.addAccount(acct5);

        if (acct5.withdraw(900.00)) {
            customer.addAccount(acct5);
            System.out.print(" withdraw is successful" + acct5.getBalance());
        }

    }
}
