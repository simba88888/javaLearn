package learning.test.functions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {

    }
    BiPredicate<Employee,Movie> biPredicate = (employee,movie)->employee.getName().equals(movie.toString());

    private void testBipredication(Employee employee1,Movie movie2){
        biPredicate.test(employee1,movie2);
    }
}
class BiConsumerInteface{
    BiConsumer<Employee,Movie> consumer = (employee, movie) -> System.out.println(employee.getRating()+movie.toString());

     public static void main(String[] args) {
        new BiConsumerInteface().consumer.accept(new Employee(1,"fdf"),new Movie("dfd"));
     }
}
class BiFuncitons{
    BiFunction<String,Movie,Employee> biFunction = (s,movie)->new Employee(Integer.valueOf(s),movie.toString());
}