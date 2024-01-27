public class kadans {
    public static void Kadans(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            maxSum=Math.max(cs, maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadans(arr);

    }
}
