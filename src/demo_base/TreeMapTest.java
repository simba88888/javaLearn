package demo_base;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    /**
     * 1.TreeMap
     * 2.JMM
     * 3.Lock condition
     * 4.分布式事务,分布式锁
     * 5.垃圾回收机制
     * 6.垃圾回收
     * @param args
     */
    public static void main(String[] args) {
        Map map = new TreeMap();
        Map map2 = new HashMap();

        map2.put("1","dddf");
        map2.put("4","ddd");

        System.out.println(map2.get("1"));

        map2.put("1","eee");
        System.out.println(map2.get("1"));


    }
}
