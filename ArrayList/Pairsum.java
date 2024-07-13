package ArrayList;
import java.util.ArrayList;
public class Pairsum {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        //brute force

        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i)+list.get(j)==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //two pointer
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j)==target){
                return true;
            }
            if(list.get(i)+list.get(j)<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(pairSum(list, target));
    }
}
