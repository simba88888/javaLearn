package learning.test.interfaces;

interface Vehicle{
    default String model(){
        return "BMZ";
    }
}
interface Engine{
    default String make(){
        return "make";
    }
}
class Car implements Vehicle,Engine{
    String makeAndModel(){
        return "default car" ;
//        return Engine.super.make()+Vehicle.super.model();
    }
    String makeAndModel2(){
        return make()+model();
    }
}

public class InheritBehaviorInterface {
    public static void main(String[] args) {
        System.out.println(new Car().makeAndModel());
        System.out.println(new Car().makeAndModel2());
    }
}
