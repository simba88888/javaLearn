package demo_base.pattern.proxyPattern;

import java.lang.reflect.Proxy;

public class DynamicProxyFactory2{
    //被代理的对象
    private Object target;

    public DynamicProxyFactory2(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //generate proxy object,生成代理对象
    public Object newProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new DynamicProxy<>(target));
    }

}
