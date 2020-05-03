package demo_base.pattern.strategy;

public class UserQueryStrategy implements QueryStrategy {
    @Override
    public String queryTable(String searchText) {
        return "user";
    }
}
