package demo_base.pattern.strategyPattern;

public class BusinessOriginalImpl {
    public String queryTables(String identify,String searchText) {
        if ("school".equals(identify)) {
            return querySchoolTable(searchText);
        } else if ("user".equals(identify)) {
            return queryUserTable(searchText);
        } else if ("class".equals(identify)) {
            return queryClassTable(searchText);
        } else {
            return "do nothing";
        }
    }

    private String queryClassTable(String searchText) {
        return "class";
    }

    private String queryUserTable(String searchText) {
        return "user";
    }

    private String querySchoolTable(String searchText) {
        return "school";
    }
}
