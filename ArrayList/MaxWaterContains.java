package ArrayList;
import java.util.ArrayList;
public class MaxWaterContains {

    public static int maxWater(ArrayList<Integer> height){

        //brute force - O(n^2)

        // int max=0;
        // for(int i=0; i<height.size(); i++){
        //     for(int j=i+1; j<height.size(); j++){
        //         int ht = Math.min(height.get(i),height.get(j));
        //         int wd=j-i;
        //         int currWater = ht*wd;
        //         max = Math.max(max,currWater);
        //     }
        // }

        //two pointer - O(n)

        int max=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wd=rp-lp;
            int currWater=ht*wd;
            max=Math.max(currWater,max);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxWater(height));
    }
}
