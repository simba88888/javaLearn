package learning.test.functions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FunctionFunctionInterface {
    public interface Funciton<T,R>{
        R apply(T t);
    }
    Funciton<String,Movie> getMovie = s ->new Movie(s);
    private Movie testMovie(String movie){
        return getMovie.apply(movie);
    }

    public static void main(String[] args) {
        System.out.println(new FunctionFunctionInterface().testMovie("hello"));
    }
    @Test
    public void testFlatMap(){
        List<String> list = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("ddd eee fff");
        list.add("ggg hhh iii");

        list = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(toList());
        List<String> list1 = list.stream().map(s->s.split(" "))
                    .flatMap(e -> Arrays.stream(e.clone())).collect(toList());
        System.out.println(list+ "-"+list1);
    }
    @Test
    public void test(){
        IntStream.range(0,10).forEach(i -> System.out.println(i));
        IntStream intStream = IntStream.range(4,20);
        OptionalInt optionalInt = intStream.max();
        System.out.println(optionalInt.getAsInt());
    }
    @Test
    public void test1(){
        IntStream.rangeClosed(0,10).forEach( i -> System.out.println(i));
    }

}
