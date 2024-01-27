public class maxsubarr {
    public static void maxsubarraysum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=0;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=start==0 ? prefix[end]:prefix[end]+prefix[start-1];
                // for(int k=start;k<=end;k++){
                //     currSum=currSum+arr[k];
                // }
                // System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum is :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,-2,-4,8};
        maxsubarraysum(arr);
    }
}
