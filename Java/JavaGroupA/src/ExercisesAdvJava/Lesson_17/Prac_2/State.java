package ExercisesAdvJava.Lesson_17.Prac_2;

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
