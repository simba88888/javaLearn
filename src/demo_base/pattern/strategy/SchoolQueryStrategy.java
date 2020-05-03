package demo_base.pattern.strategy;

public class SchoolQueryStrategy implements QueryStrategy {

    @Override
    public String queryTable(String searchText) {
        return "school";
    }
}
