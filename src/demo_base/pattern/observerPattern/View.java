package demo_base.pattern.observerPattern;

public class View implements Observer {
    private DataSource dataSource;
    private String name;

    public View(String name) {
        this.name = name;
    }

    public View(DataSource dataSource, String name) {
        this.dataSource = dataSource;
        this.name = name;
        this.dataSource.beSubscribe(this);
    }

    @Override
    public void update() {
        System.out.println("data: "
                + dataSource.felchData()+", name is "+name);
    }
}



