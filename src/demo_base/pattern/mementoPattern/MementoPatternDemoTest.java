package demo_base.pattern.mementoPattern;

class JavaBean {
    private String state;

    public JavaBean(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void revert(Memento memento) {
        this.setState(memento.getState());
    }
}

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class MementoManage {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

public class MementoPatternDemoTest {
    public static void main(String[] args) {
        JavaBean javaBean1 = new JavaBean("1");
        MementoManage mementoManage = new MementoManage();
        mementoManage.setMemento(javaBean1.createMemento());

        javaBean1.setState("2");

        System.out.println(javaBean1.getState()); //2
        javaBean1.revert(mementoManage.getMemento());
        System.out.println(javaBean1.getState());//1
    }
}
