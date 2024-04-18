package Patterns.StrategyExample2;

public class Developer {
    Activity activity;

    public Developer() {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
