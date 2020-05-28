package demo_base.pattern.templatePattern;

abstract class BaseSteps {
    public final void templateMethod() {
        handleFirst();
        handleSecond();
        handleThirdth();
        handleFourth();
    }

    private void handleFirst() {
        System.out.println(BaseSteps.class.getSimpleName() + " handleFirst");
    }

    protected abstract void handleSecond();

    protected abstract void handleThirdth();

    protected abstract void handleFourth();
}

class ConcreA extends BaseSteps {

    @Override
    protected void handleSecond() {
        System.out.println(ConcreA.class.getSimpleName() + " " + "handleSecond");
    }

    @Override
    protected void handleThirdth() {
        System.out.println(ConcreA.class.getSimpleName() + " " + "handleThirdth");
    }

    @Override
    protected void handleFourth() {
        System.out.println(ConcreA.class.getSimpleName() + " " + "handleFourth");
    }
}

class ConcreB extends BaseSteps {

    @Override
    protected void handleSecond() {
        System.out.println(ConcreB.class.getSimpleName() + " " + "handleSecond");
    }

    @Override
    protected void handleThirdth() {
        System.out.println(ConcreB.class.getSimpleName() + " " + "handleThirdth");
    }

    @Override
    protected void handleFourth() {
        System.out.println(ConcreB.class.getSimpleName() + " " + "handleFourth");
    }
}


public class TemplatePatternDemoTest {
    public static void main(String[] args) {
        BaseSteps baseSteps = new ConcreA();
        baseSteps.templateMethod();

        System.out.println();

        baseSteps = new ConcreB();
        baseSteps.templateMethod();

    /*    BaseSteps handleFirst
        ConcreA handleSecond
        ConcreA handleThirdth
        ConcreA handleFourth

        BaseSteps handleFirst
        ConcreB handleSecond
        ConcreB handleThirdth
        ConcreB handleFourth*/
    }
}



