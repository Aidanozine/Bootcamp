package ExercisesAdvJava.Lesson_5.Prac_1;

public class AbstractBankingMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        initializeCustomers(bank);

        // run the customer report
        CustomerReport report = new CustomerReport();
        report.setBank(bank);
        report.generateReport();
    }

    private static void initializeCustomers(Bank bank) {
        Customer customer;
// Create several customers and their accounts
        bank.addCustomer("Chuck", "Norris");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Jet", "Lee");
        customer = bank.getCustomer(1);
        SavingsAccount sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Bruce", "Lee");
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Sylvester", "Stallone");
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Brad", "Pitt");
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Chris", "Evans");
        customer = bank.getCustomer(5);
        CheckingAccount chkAcct = new CheckingAccount(100.00);

        customer.addAccount(chkAcct);

        if (chkAcct.withdraw(900.00)) {
            customer.addAccount(chkAcct);
            System.out.print(" withdraw is successful" + chkAcct.getBalance());
        }

    }
}
