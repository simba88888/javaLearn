package learning.test.interfaces;

public class FunctionInterface {
    public FunctionInterface() {
    }
    @FunctionalInterface
    interface Multipler{
        int multipler(int n,int m);
    }
    Multipler multipler = (x,a)->x*a;
    public int multiplerService(int a,int b,Multipler multipler){
        return multipler.multipler(a,b);
    }
    public static void main(String[] args) {
        FunctionInterface functionInterface = new FunctionInterface();
        System.out.println(functionInterface.multiplerService(10,20,(a,b)->a*b));
    }
}
