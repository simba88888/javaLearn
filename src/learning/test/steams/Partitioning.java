package learning.test.steams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Partitioning {
    protected static final List<Employee> list = Arrays.asList(
            new Employee(1, "Alex", 1000),
            new Employee(2, "Michael", 2000),
            new Employee(3, "Jack", 1500),
            new Employee(4, "Owen", 1500),
            new Employee(5, "Denny", 2000));


    public static void main(String[] args) {
        //把工资大于1500放在true的列表里,小于或等于1500放在false列表里
        Map<Boolean, List<Employee>> map = list.stream().collect(Collectors.partitioningBy(employee -> {
            return employee.getSalary() > 1500;
        }));
        System.out.println("true:{}"+map.get(Boolean.TRUE));
        System.out.println("false:{}"+map.get(Boolean.FALSE));
        Map<Boolean, Map<Integer,List<Employee>>> map2 = list.stream().collect(Collectors.partitioningBy((employee -> {
            return employee.getSalary() > 1500;
        }),Collectors.groupingBy(Employee::getSalary)));
        System.out.println("true:{}"+map2.get(Boolean.TRUE));
        System.out.println("false:{}"+map2.get(Boolean.FALSE));

    }

}
