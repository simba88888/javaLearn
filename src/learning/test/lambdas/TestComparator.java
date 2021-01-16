package learning.test.lambdas;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparator implements Comparator<String> {
    public TestComparator() {
    }

    public static void main(String[] args) {
        System.out.println("hello world!");
        TreeSet treeSet = new TreeSet(new TestComparator());
        treeSet.add("ffd");
        treeSet.add("fd");
        treeSet.add("12343");
        treeSet.add("34389434597");
        treeSet.stream().forEach(item->{
            System.out.println(item.toString());
        });
    }


    @Override
    public int compare(String o1, String o2) {
        /*return o1.length()-o2.length();*/
        return o2.length()-o1.length();
    }
}
