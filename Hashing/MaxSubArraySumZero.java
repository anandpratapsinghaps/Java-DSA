package Hashing;

public class MaxSubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == 0 && (j-i+1)>max){
                    max = j-i+1;
                }
            }
        }
        System.out.println(max);
    }
}
