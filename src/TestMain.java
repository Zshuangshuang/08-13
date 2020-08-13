import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-13
 * Time:19:04
 **/
public class TestMain {
    public static void main(String[] args) {
        int i = 9;
        Integer i1 = Integer.valueOf(i);
        int j = Integer.valueOf(i);
    }
    public static void main2(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("现男友","李现");
        map.put("胆小鬼","邓伦");
        map.put("调皮鬼","杨紫");
        System.out.println(map);
        System.out.println(map.get("现男友"));
        System.out.println(map.getOrDefault("花花公子", "刘星"));
        System.out.println(map.containsKey("嘻嘻"));
        System.out.println(map.size());
        for (Map.Entry<String,String > entry:map.entrySet()) {
            System.out.print(entry.getKey()+":"+entry.getValue());
            System.out.println();
        }
        /*Map<String,String > map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("万能宝贝","哆小啦");
        map.put("国民女神","瞿颖");
        for (String s: map.values()) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(map);
        System.out.println(map.get("万能宝贝"));
        System.out.println(map.getOrDefault("及时雨", "淼淼"));
        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("淼淼"));
        for (Map.Entry<String,String > entry: map.entrySet()) {
            System.out.print(entry.getKey()+":" +entry.getValue());
            System.out.println();
        }*/
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("C语言");
        collection.add("Ruby");
        collection.add("Python");
        collection.add("C++");
        for (String s:collection) {
            System.out.print(s+" ");
        }
        /*System.out.println(collection);*/
        collection.remove("C++");
        boolean ret = collection.isEmpty();
        System.out.println(ret);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        collection.clear();
        /*Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("C语言");
        collection.add("Python");
        collection.add("Ruby");
        System.out.println(collection);
       *//* collection.clear();*//*
        collection.size();
        collection.remove("C语言");
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString((objects)));*/
    }
}
