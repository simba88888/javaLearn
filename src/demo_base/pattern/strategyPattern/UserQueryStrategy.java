package demo_base.pattern.strategyPattern;

public class UserQueryStrategy implements QueryStrategy {
    @Override
    public String queryTable(String searchText) {
        return "user";
    }
}
