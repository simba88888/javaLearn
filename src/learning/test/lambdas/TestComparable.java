package learning.test.lambdas;

import java.util.Arrays;
import java.util.TreeSet;

public class TestComparable implements Comparable<TestComparable> {
    public TestComparable(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new TestComparable("ffd"));
        treeSet.add(new TestComparable("fd"));
        treeSet.add(new TestComparable("12343"));
        treeSet.add(new TestComparable("34389434597"));
        treeSet.stream().forEach(item->{//.map(item->(TestComparable) item)
            System.out.println(((TestComparable) item).name.toString());
        });

        System.out.println("--------ARRAY---------");
        TestComparable[] array = {new TestComparable("sd"),new TestComparable("hello"),new TestComparable("ff"),new TestComparable("fdsfdsfd")};
        Arrays.stream(array).forEach(item ->{
            System.out.println("原始数组："+item.name);
        });
        Arrays.sort(array);
        Arrays.stream(array).forEach(item ->{
            System.out.println("排序后数组："+item.name);
        });
    }

    @Override
    public int compareTo(TestComparable o) {
        return this.name.length()-o.name.length();
    }
}
