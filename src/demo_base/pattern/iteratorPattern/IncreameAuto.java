package demo_base.pattern.iteratorPattern;

public class IncreameAuto {
    public static void main(String[] args) {
        int index = 0;

        System.out.println(index++);//0
        System.out.println(index++);//1
        System.out.println(++index);//3

        int before = ++index;
        System.out.println(before);//4

        int after = index++;
        System.out.println(after);//4

        System.out.println(index);//5

    }
}
