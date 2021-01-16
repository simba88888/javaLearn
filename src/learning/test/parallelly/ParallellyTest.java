package learning.test.parallelly;

import java.util.stream.Stream;

public class ParallellyTest {
    public static void main(String[] args) {
        Stream.of(1,3,5,6,4,32,3).forEach(e->{
            System.out.println(Thread.currentThread().getName()+"-"+e);
        });
        System.out.println("------------------");
        Stream.of(1,3,5,6,4,32,3).parallel().forEach(e->{
            System.out.println(Thread.currentThread().getName()+"-"+e);
        });
        //peek nothing return;  map have return;
    }
}
