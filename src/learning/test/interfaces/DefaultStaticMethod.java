package learning.test.interfaces;

public class DefaultStaticMethod {
    public static void main(String[] args) {
        class EmployeeImpl implements Employee{

            @Override
            public Employee findById(int id) {
                boolean is = isExec(id);
                return null;
            }
        }
        Employee.getDefaultCountry();
        EmployeeImpl impl = new EmployeeImpl();
        impl.isExec(1);

    }
}
@FunctionalInterface
interface Employee{
    //abstract method
    Employee findById(int id);

    //default method
    default boolean isExec(int id){
        return true;
    }

    //static method
    static String getDefaultCountry(){
        return "CN";
    }

}
