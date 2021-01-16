package learning.test.functions;

//check if a movie is classcial
interface Moviea{
    boolean isClassical(int movieId);
}

interface Person{
    boolean isEmployee(int personId);
}

public class WhatAreFunction {
    interface Predicate<T>{
        boolean test(T a);
    }
}
