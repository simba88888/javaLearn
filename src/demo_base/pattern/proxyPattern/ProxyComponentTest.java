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
        DynamicProxyFactory dynamicProxyFactory = new DynamicProxyFactory(monkey);
        Animal monkeyProxy = (Animal) dynamicProxyFactory.newProxyInstance();
        monkeyProxy.eat();

        Machine phone = new Phone();
        dynamicProxyFactory.setTarget(phone);
        Machine phoneProxy = (Machine) dynamicProxyFactory.newProxyInstance();
        phoneProxy.compute();
        /*
        运行解决如下：
        -------- begin --------
        This DynamicProxyFactory is dynamicProxyMethodBeforeActioning.
        This Monkey is eating.
        This DynamicProxyFactory is dynamicProxyMethodAfterActioning.
        -------- end --------

                -------- begin --------
        This DynamicProxyFactory is dynamicProxyMethodBeforeActioning.
        This Phone is computeing.
        This DynamicProxyFactory is dynamicProxyMethodAfterActioning.
        -------- end --------
        */
    }

    @Test
    public void testDynamicProxy2(){
        //动态代理可以代理任何对象
        Animal monkey = new Animal() {
            @Override
            public void eat() {

            }

            @Override
            public void run() {

            }
        };// new Monkey();
        DynamicProxyFactory2 dynamicProxyFactory = new DynamicProxyFactory2(monkey);
        Animal monkeyProxy = (Animal) dynamicProxyFactory.newProxyInstance();
        monkeyProxy.eat();

        Machine phone = new Phone();
        dynamicProxyFactory.setTarget(phone);
        Machine phoneProxy = (Machine) dynamicProxyFactory.newProxyInstance();
        phoneProxy.compute();
        /*
        运行解决如下：
        -------- begin --------
        This DynamicProxyFactory is dynamicProxyMethodBeforeActioning.
        This Monkey is eating.
        This DynamicProxyFactory is dynamicProxyMethodAfterActioning.
        -------- end --------

                -------- begin --------
        This DynamicProxyFactory is dynamicProxyMethodBeforeActioning.
        This Phone is computeing.
        This DynamicProxyFactory is dynamicProxyMethodAfterActioning.
        -------- end --------
        */
    }

}
