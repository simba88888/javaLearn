package demo_base.pattern.statePattern;

interface State{
    void handle(Context context);
}

class ConcreStateA implements State{

    @Override
    public void handle(Context context) {
        System.out.println(ConcreStateA.class.getSimpleName()+" ....");
        context.setState(new ConcreStateB());
    }
}

class ConcreStateB implements State{

    @Override
    public void handle(Context context) {
        System.out.println(ConcreStateB.class.getSimpleName()+" ....");
        context.setState(new ConcreStateA());
    }
}

class Context{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
public class StatePatternDemoTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreStateA());
        context.handle();
        context.handle();
        context.handle();
        context.handle();
     /*   ConcreStateA ....
        ConcreStateB ....
        ConcreStateA ....
        ConcreStateB ....*/
    }
}
