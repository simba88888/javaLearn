package demo_base.pattern.strategyPattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {
    private static Map<String, QueryStrategy> context = new HashMap<>();

    static {
        context.put(IdentifyEnum.SCHOOL.getName(),new SchoolQueryStrategy());
        context.put(IdentifyEnum.CLASS.getName(), new ClassQueryStrategy());
        context.put(IdentifyEnum.USER.getName(), new UserQueryStrategy());
    }

    public static QueryStrategy getSpecifyQueryStrategy(String name) {
        return context.get(name);
    }
}
