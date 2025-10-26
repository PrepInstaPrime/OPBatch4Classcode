import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // inserting values 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        // update value
        list.set(3, 4);
        System.out.println(list);
        // remove the value 
        list.remove(2);
        System.out.println(list);
        // accessing value 
        System.out.println(list.get(0));
        // iteration 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Iteration with for each");
        for(int val:list){
            System.out.println(val);
        }
        // clear the list 
        list.clear();
        System.out.println(list);
    }
}
