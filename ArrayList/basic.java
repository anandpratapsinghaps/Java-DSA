package ArrayList;
import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);

        //add element at particular index
        list.add(1,20);
        System.out.println(list);

    //     //get element
    //     int element=list.get(2);
    //     System.out.println(element);

    //     //delete
    //     list.remove(1);
    //     System.out.println(list);

    //set element
    // list.set(2, 50);
    // System.out.println(list);

    // //contains
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(6));
    

    System.out.println(list.size());   //.size() is method not a property like .length in array

    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
    }

    }
}
