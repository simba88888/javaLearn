package demo_base;

import java.util.HashMap;
import java.util.Map;

public class TestString {

    public static void main(String[] args) {
        Map<String,String> argsInfo = new HashMap<String, String>();

        String sql = "select 1\n" +
                "from T_RMBS_HRDEP_ROLE_OU t\n" +
                "         join T_RMBS_HRDEP_ROLE_MAP t1\n" +
                "              on t1.id = t.MAP_ID\n" +
                "where t1.ROLE_NAME = :roleName\n" +
                "  and t.ORG_ID = :groupId\n" +
                "union all\n" +
                "select 1\n" +
                "from SYS_USER_ROLE t\n" +
                "         join SYS_ROLE t1\n" +
                "              on t1.ROLEID = t.ROLE_ID\n" +
                "where t.USER_ID = :userid\n" +
                "  and t1.NAME = :roleName\n" +
                "  and t.GROUP_ID = :groupId";

        argsInfo.put("roleName", "dd");
        argsInfo.put("groupId", "dfasdf");
        argsInfo.put("userid", "dfdf");
        String result = replaceField(sql,argsInfo);
        System.out.println(result);
    }
    public static String replaceField(String sql,Map<String,String> info){
        for (Map.Entry<String, String> e : info.entrySet()) {
            sql = sql.replaceAll(":" + e.getKey(), e.getValue());
        }
        return  sql;
    }
}
