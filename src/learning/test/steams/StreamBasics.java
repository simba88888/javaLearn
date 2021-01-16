package learning.test.steams;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
    //filter is lazy , map count is eager
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("yellow","red","blue");
        nameList.parallelStream().filter(item -> item.length()>5).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(nameList.stream().count());
        System.out.println();
        new StreamBasics().testEmpty();

        for (int a=0;a<10;a++){
            System.out.println("findAny Test: "+ nameList.stream().findAny().get());
        }
        Stream<Double> random = Stream.generate(Math::random);
        Stream.iterate(1,e -> e +1);

        nameList.stream().skip(2).forEach(item-> System.out.println("Skip test: "+item));
        Map<String,Integer> map = nameList.stream().collect(Collectors.toMap(e->e, e->e.length()));
        try {
            Files.lines(Paths.get("/Users/tem.txt")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void testEmpty(){
        Stream<String> emptyStream = Stream.empty();
        System.out.println("empty stream "+emptyStream.count());
    }
    @Test
    public void testReduce(){
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        //求集合元素只和
        Integer result = stream.reduce(0, Integer::sum);
        System.out.println(result);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("sum1 "+stream.mapToInt(e->e).sum());
//        System.out.println(stream.reduce((a,b)->a+","+b));


//        Optional<Integer> sum = stream.reduce((a, b)->a+b);
//        System.out.println("sum : "+sum.get());
    }
}
