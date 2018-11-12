package processbase;

public abstract class MyAbtractProcess {

    public void process() {
        beforeAction();
        action();
        afterAction();
    }

    public void beforeAction() {

    }

    public abstract void action();

    public void afterAction() {

    }
}
