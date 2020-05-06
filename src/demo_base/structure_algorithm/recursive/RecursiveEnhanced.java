package demo_base.structure_algorithm.recursive;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class RecursiveEnhanced {

    private static Map<String, Data> mapDatas = new HashMap() {
        {
            // null -> 1 -> 2 - >3 -> 4 -> 5 -> 6
            put("1", new Data(null, "1", "name1"));
            put("2", new Data("1", "2", "name2"));
            put("3", new Data("2", "3", "name3"));
            put("4", new Data("3", "4", "name4"));
            put("5", new Data("4", "5", "name5"));
            put("6", new Data("5", "6", "name6"));

            //7 -> 8 -> 9 ->10 -> 11
            put("8", new Data("7", "8", "name8"));
            put("9", new Data("8", "9", "name9"));
            put("10", new Data("9", "10", "name10"));
            put("11", new Data("10", "11", "name11"));
        }
    };

    private static Set<String> dataIndex = new HashSet<>();

    {
        dataIndex = mapDatas.entrySet().stream().map(item -> item.getKey()).collect(Collectors.toSet());
    }

    public List<Data> getParentDataList(List<Data> datas) {
        List<Data> dataList = new ArrayList<>();
        if (datas == null) {
            return new ArrayList<>();
        } else {
            List<String> parentIds = datas.stream().map(Data::getParent).filter(Objects::nonNull).collect(Collectors.toList());
            if (!parentIds.isEmpty()) {
                List<Data> parentDataList = getDataByIds(parentIds);
                dataList.addAll(parentDataList);
                dataList.addAll(getParentDataList(parentDataList));
            } else {
                return new ArrayList<>();
            }
        }
        return dataList;
    }



    private List<Data> getDataByIds(List<String> ids) {

        List<Data> datas = ids.stream().filter(item -> dataIndex.contains(item))
                .map(id -> mapDatas.get(id)).collect(Collectors.toList());

        return datas;
    }

    @Test
    public void testIds() {
        List<String> ids = new ArrayList<>();
        ids.add("11");
        ids.add("6");
        System.out.println(getDataByIds(ids).toString());
        System.out.println(getParentDataList(getDataByIds(ids)).toString());

    }

    public static class Data {
        private String parent;
        private String id;
        private String name;

        public Data(String parent, String id, String name) {
            this.parent = parent;
            this.id = id;
            this.name = name;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name  " + name + "  :" + "parent  " + parent + "  :" + "id  " + id + "\n";
        }
    }
}
