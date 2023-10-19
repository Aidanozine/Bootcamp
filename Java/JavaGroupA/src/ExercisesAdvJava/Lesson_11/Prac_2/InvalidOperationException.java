package ExercisesAdvJava.Lesson_11.Prac_2;

public class InvalidOperationException extends Exception {

    public InvalidOperationException() {
        super();
    }

    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException(Throwable cause) {
        super(cause);
    }

    public InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
