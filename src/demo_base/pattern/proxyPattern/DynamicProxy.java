package demo_base.pattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy<T> implements InvocationHandler {
    private Object target;
    public DynamicProxy(Object object) {
        this.target = object;
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
}
