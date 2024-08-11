package Stack;
import java.util.*;
public class MaxArea {
    public static int maxAreaHistogram(int height[]){
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int maxReactArea = 0;

        //for next Smaller left
        for(int i=0; i<height.length; i++){
            while(!s1.isEmpty() && height[s1.peek()]>=height[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s1.peek();
            }
            s1.push(i);
        }

        //for next smaller right
        for(int i=height.length-1; i>=0; i--){
            while(!s2.isEmpty() && height[s2.peek()]>=height[i]){
                s2.pop();
            }
            if(s2.isEmpty()){
                nsr[i] = height.length;
            } else{
                nsr[i] = s2.peek();
            }
            s2.push(i);
        }

        for(int i=0; i<height.length; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = height[i] * width;
            maxReactArea =Math.max(maxReactArea,area);
        }
        return maxReactArea;
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        int res = maxAreaHistogram(height);
        System.out.println(res);
    }
}
