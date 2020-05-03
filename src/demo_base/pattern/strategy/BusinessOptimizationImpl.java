package demo_base.pattern.strategy;

public class BusinessOptimizationImpl {
    public String queryTables(String identify,String searchText) {
        //get impl strategy
        QueryStrategy queryStrategy = StrategyContext.getSpecifyQueryStrategy(identify);
        // run method
        return queryStrategy.queryTable(searchText);
    }
}


