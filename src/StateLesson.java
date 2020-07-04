public class StateLesson {
    public static void main(String[] args) {
        Context context = new Context(new LowerCaseStat(), "Max");
        context.doAction();
        context.setState(new UpperCaseStat());
        context.doAction();
    }
}

interface State {
    void doAction(Context context);
}

class LowerCaseStat implements State {
    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toLowerCase());
    }
}

class UpperCaseStat implements State {
    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toUpperCase());
    }
}

class Context {
    State state;
    String name;

    public Context(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    void doAction() {
        state.doAction(this);
    }
}