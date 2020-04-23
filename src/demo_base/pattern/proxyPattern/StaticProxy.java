package demo_base.pattern.proxyPattern;
/**
 * @author BinYang
 */
public class StaticProxy implements Animal {
    Animal animal;

    public StaticProxy(Animal animal) {
        this.animal = animal;
    }

    public void staticProxyMethodBeforeAction() {
        System.out.println("-------- begin --------");
        ToolUtils.printAction(StaticProxy.class);
    }

    public void staticProxyMethodAfterAction() {
        ToolUtils.printAction(StaticProxy.class);
        System.out.println("-------- end --------");
        System.out.println();
    }

    @Override
    public void eat() {
        staticProxyMethodBeforeAction();
        animal.eat();
        staticProxyMethodAfterAction();
    }

    @Override
    public void run() {
        staticProxyMethodBeforeAction();
        animal.run();
        staticProxyMethodAfterAction();
    }
}
