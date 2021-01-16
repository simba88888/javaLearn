package learning.test.steams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int  id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Grouping {
    protected static final List<Employee> list = Arrays.asList(
            new Employee(1, "Alex", 1000),
            new Employee(2, "Michael", 2000),
            new Employee(3, "Jack", 1500),
            new Employee(4, "Owen", 1500),
            new Employee(5, "Denny", 2000));

    public static void main(String[] args) {
        Map<Integer,List<Employee>> map = list.stream().collect(Collectors.groupingBy(item->item.getSalary()));
        System.out.println("Map=> "+map);

        //根据薪酬获取员工数量
        Map<Integer,Long> map2 = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
        System.out.println("map2:"+map2);

        //根据薪酬获取员工薪酬总数
        Map<Integer,Double> map3 = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("map3:"+map3);
    }
}
