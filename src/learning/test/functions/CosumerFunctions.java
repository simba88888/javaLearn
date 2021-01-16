package learning.test.functions;

import java.util.function.Consumer;

class Movie{
    private String name;
    Movie(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class CosumerFunctions {
    Consumer<Movie> printInfo = movie -> System.out.println(movie);
    Consumer<Movie> persistInfo = movie -> pesist(movie);

    private void testConsumer(Movie movie){
        printInfo.accept(movie);
    }
    private void pesist(Movie movie){
        System.out.println("pesist"+movie);
    }
    private void andThen(Movie movie){
        printInfo.andThen(persistInfo).accept(movie);
    }
    public static void main(String[] args) {
        Movie movie = new Movie("yellow");
        new CosumerFunctions().testConsumer(movie);
        new CosumerFunctions().persistInfo.accept(movie);
        new CosumerFunctions().andThen(movie);
    }
}
