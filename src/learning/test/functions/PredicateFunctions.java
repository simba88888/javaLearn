package learning.test.functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctions {
    public static void main(String[] args) {
//        IntPredicate
        Predicate<Employee> bonusLambdas = (emp)->emp.getRating()>10?true:false;
        Predicate<Employee> execLambdas = (emp)->emp.getName().startsWith("ad")?true:false;
        Predicate<String> stringPredicate = (s) ->s.isEmpty();
        Predicate<Employee> isEqualsLambdas = Predicate.isEqual(new Employee(7,"admins"));
        Predicate<Employee> andLambdas = bonusLambdas.and(execLambdas);
        Predicate<Employee> orLambdas = bonusLambdas.or(execLambdas);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(12,"admin"));
        employeeList.add(new Employee(7,"admins"));
        employeeList.add(new Employee(13,"fddd"));
        employeeList.stream().filter(bonusLambdas).collect(Collectors.toList()).forEach(item ->{
            System.out.println("bonus: "+item.getRating()+" "+item.getName());
        });
        employeeList.stream().filter(bonusLambdas.negate()).collect(Collectors.toList()).forEach(item ->{
            System.out.println("not bonus: "+item.getRating()+" "+item.getName());
        });
        //.findFirst().get()
        employeeList.stream().filter(andLambdas).collect(Collectors.toList()).forEach(item ->{
            System.out.println("bonus and exec: "+item.getRating()+" "+item.getName());
        });
        employeeList.stream().filter(isEqualsLambdas).collect(Collectors.toList()).forEach(item ->{
            System.out.println("isEqualsLambdas: "+item.getRating()+" "+item.getName());
        });
        for (Employee employee: employeeList){
            if (isEqualsLambdas.test(employee)){
                System.out.println(employee.getRating()+" "+employee.getName());
            }
        }


        List<String> employees = Arrays.asList("","fd","fadmin","f");
        employees.stream().filter(stringPredicate).forEach(item->{
            System.out.println("--"+item+"--");
        });
    }
}
