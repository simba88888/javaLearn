package learning.test.functions;

import java.util.Objects;

public class Employee {
    int rate;
    String name;

    public Employee(int rate,String name) {
        this.rate = rate;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return rate == employee.rate && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, name);
    }

    int getRating(){
        return this.rate;
    }
    String getName(){
        return this.name;
    }
}
