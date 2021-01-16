package learning.test.steams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    List<Integer> integerList = Arrays.asList();

    static class Student{
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
       Optional<Integer> sum =  new OptionalTest().integerList.stream().reduce(Integer::sum);
        if(sum.isPresent())
            System.out.println(sum.orElse(0));

        Student student = new Student("hello");
        Optional<Student> aOptional = Optional.of(student);
        System.out.println(aOptional+"---"+aOptional.get());
        aOptional.ifPresent(System.out::println);

        student = null;

        Optional<Student> aOptional2= Optional.ofNullable(student);
        System.out.println(aOptional2+aOptional2.orElse(new Student("else")).toString());

    }
}
