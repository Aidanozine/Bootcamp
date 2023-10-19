package ExercisesAdvJava.Lesson_10.Prac_5;

public enum State {
    CA("CA"),
    CO("CO"),
    MA("MA");

    private final String str;

    State(String stateStr){
        this.str = stateStr;
    }

    public String getStr(){
        return str;
    }

}
