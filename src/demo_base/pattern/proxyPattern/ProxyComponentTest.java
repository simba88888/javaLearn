package demo_base.pattern.proxyPattern;

import org.junit.Test;

/**
 * @author BinYang
 */
public class ProxyComponentTest {
    @Test
    public void testStaticProxy(){
        //静态代理只能为一个种类服务
        //monkey and person both are animal
        Animal monkey = new Monkey();
        StaticProxy staticMonkeyProxy = new StaticProxy(monkey);
        staticMonkeyProxy.eat();

        Animal person = new Person();
        StaticProxy staticPersonProxy = new StaticProxy(person);
        staticPersonProxy.run();

        /*
        运行结果如下：
        -------- begin --------
        This StaticProxy is staticProxyMethodBeforeActioning.
        This Monkey is eating.
        This StaticProxy is staticProxyMethodAfterActioning.
        -------- end --------

                -------- begin --------
        This StaticProxy is staticProxyMethodBeforeActioning.
        This Person is runing.
        This StaticProxy is staticProxyMethodAfterActioning.
        -------- end --------
        */
    }

    @Test
    public void testDynamicProxy(){
        //动态代理可以代理任何对象
        Animal monkey = new Monkey();
        DynamicProxy dynamicProxyTools = new DynamicProxy(monkey);
        Animal monkeyProxy = (Animal) dynamicProxyTools.newProxyInstance();
        monkeyProxy.eat();

        Machine phone = new Phone();
        dynamicProxyTools.setTarget(phone);
        Machine phoneProxy = (Machine) dynamicProxyTools.newProxyInstance();
        phoneProxy.compute();
        /*
        运行解决如下：
        -------- begin --------
        This DynamicProxy is dynamicProxyMethodBeforeActioning.
        This Monkey is eating.
        This DynamicProxy is dynamicProxyMethodAfterActioning.
        -------- end --------

                -------- begin --------
        This DynamicProxy is dynamicProxyMethodBeforeActioning.
        This Phone is computeing.
        This DynamicProxy is dynamicProxyMethodAfterActioning.
        -------- end --------
        */
    }


}
