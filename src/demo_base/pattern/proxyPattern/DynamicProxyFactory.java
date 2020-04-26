package demo_base.pattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @author BinYang
 */
public class DynamicProxyFactory implements InvocationHandler {
    //被代理的对象
    private Object target;

    public DynamicProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dynamicProxyMethodBeforeAction();
        Object obj = method.invoke(target, args);
        dynamicProxyMethodAfterAction();
        return obj;
    }

    public void dynamicProxyMethodBeforeAction() {
        System.out.println("-------- begin --------");
        ToolUtils.printAction(DynamicProxyFactory.class);
    }

    public void dynamicProxyMethodAfterAction() {
        ToolUtils.printAction(DynamicProxyFactory.class);
        System.out.println("-------- end --------");
        System.out.println();
    }

    //generate proxy object,生成代理对象
    public Object newProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
