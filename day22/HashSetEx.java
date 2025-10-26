import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        // inserting values 
        set.add(1);
        set.add(2);
        set.add(2);
        // priting hashset
        System.out.println(set);
        // check for a values 
        System.out.println(set.contains(2));
        // get the size of the set
        System.out.println(set.size());
        // you need to use for each loop for hashset iteration 
        for(int val:set){
            System.out.println(val);
        }
        // remove the value 
        set.remove(1);
        System.out.println(set);
        // delete everything 
        set.clear();
        System.out.println(set);
    }
}
