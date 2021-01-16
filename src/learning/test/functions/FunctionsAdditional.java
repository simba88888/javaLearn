package learning.test.functions;

import java.util.function.Function;

public class FunctionsAdditional {
    Function<Movie,Employee> employeeFinder = movie -> findEmployee(movie);
    Function<Employee,Movie> movieFinder = employee -> findMovie(employee);
    private Employee findEmployee(Movie movie){
        return new Employee(12,"hello");
    }
    private Movie findMovie(Employee employee){
        return new Movie("hee");
    }

    Function<Movie,Movie> andThenFunction = employeeFinder.andThen(movieFinder);
    Function<Employee,Employee> composeFunction = employeeFinder.compose(movieFinder);//先movieFinder，再employee
    private void testIdentify(){
        Function<String,String> function = Function.identity();
       String resut =  function.apply("ABCDEF");
        System.out.println("reuslt "+resut);
    }
    private Movie testAndThen(Movie movie){
        return andThenFunction.apply(movie);
    }

    public static void main(String[] args) {
        new FunctionsAdditional().testIdentify();
    }

}
