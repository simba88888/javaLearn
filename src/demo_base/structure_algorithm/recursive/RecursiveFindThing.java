package demo_base.structure_algorithm.recursive;

public class RecursiveFindThing {
    private static int target = 5;

    public static void findThing(int position) {
        if (position > 1) {
            if (target == position) {
                System.out.println("东西找到了，在第" + position + "层");
            } else {
                System.out.println("现在正在找东西，找到第" + (position - 1) + "层了");
                findThing(position - 1);
                System.out.println("现在正在返回，返回到第" + position + "层");
            }

        }
    }

    public static void main(String[] args) {
        target = 6;
        findThing(20);
    }
}




