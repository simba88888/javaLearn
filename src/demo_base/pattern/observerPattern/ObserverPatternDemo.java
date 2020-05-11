package demo_base.pattern.observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        new View(dataSource, "view1");
        new View(dataSource, "view2");
        new View(dataSource, "view3");
        System.out.println("will change data is 20");
        dataSource.setData("20");
        System.out.println();
        System.out.println("will change data is 15");
        dataSource.setData("15");
        /*
        will change data is 20
        data: 20, name is view1
        data: 20, name is view2
        data: 20, name is view3

        will change data is 15
        data: 15, name is view1
        data: 15, name is view2
        data: 15, name is view3
        */
    }
}
