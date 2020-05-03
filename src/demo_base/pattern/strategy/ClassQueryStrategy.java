package demo_base.pattern.strategy;

public class ClassQueryStrategy implements QueryStrategy {
    @Override
    public String queryTable(String searchText) {
        return "class";
    }
}
