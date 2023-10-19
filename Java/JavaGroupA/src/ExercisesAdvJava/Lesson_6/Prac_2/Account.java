package ExercisesAdvJava.Lesson_6.Prac_2;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Current balance is " + balance;
    }
}
