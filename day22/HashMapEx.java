import java.util.HashMap;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        // inserting values 
        map.put("mango", 4);
        map.put("ornages",5);
        System.out.println(map);
        // update values 
        map.put("mango",10);
        System.out.println(map);
        // get values by key
        System.out.println(map.get("ornages"));
        // check for the particular key 
        System.out.println(map.containsKey("mango"));
        // find the size 
        System.out.println(map.size());
        map.remove("mango");
        System.out.println("map after deletion");
        System.out.println(map);
        System.out.println(map.getOrDefault("mango",0));
        map.clear();
        System.out.println(map);

    }
}
