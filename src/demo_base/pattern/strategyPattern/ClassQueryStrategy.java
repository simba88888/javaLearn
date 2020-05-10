package demo_base.pattern.strategyPattern;

public class ClassQueryStrategy implements QueryStrategy {
    @Override
    public String queryTable(String searchText) {
        return "class";
    }
}
