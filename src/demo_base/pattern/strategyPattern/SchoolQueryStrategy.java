package demo_base.pattern.strategyPattern;

public class SchoolQueryStrategy implements QueryStrategy {

    @Override
    public String queryTable(String searchText) {
        return "school";
    }
}