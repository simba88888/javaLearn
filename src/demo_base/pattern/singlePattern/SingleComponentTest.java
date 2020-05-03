package demo_base.pattern.singlePattern;

import org.junit.Test;

public class SingleComponentTest {
    @Test
    public void testLazyPattern() {
        for (int a = 0; a < 200; a++) {
            new Thread(() -> {
                LazyPattern.getSimpleInstance();
                HungryPattern.getSimpleInstance();
            }).start();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /*
       結果如下：
        LazyPattern initialization :1
        LazyPattern initialization :4
        LazyPattern initialization :3
        LazyPattern initialization :2
        HungryPattern initialization :1
        */
    }

    @Test
    public void testNumAdd() {
        int num = 1;
        System.out.println("++num: " + ++num + "\t num:" + num); //2,2
        num = 1;
        System.out.println("num++: " + num++ + "\t num:" + num);//1,2
    }

    @Test
    public void testEnumSingleton() {
        // 单例测试
        SingleEnumPattern firstSingleton = SingleEnumPattern.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        SingleEnumPattern secondSingleton = SingleEnumPattern.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        // 反射获取实例测试
        try {
            SingleEnumPattern[] enumConstants = SingleEnumPattern.class.getEnumConstants();
            for (SingleEnumPattern enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
