public class RemoveEven {

    public static int[] removeeven(int arr[]){
        int oddCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }

        int[] res = new int[oddCount];
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(removeeven(arr));
    }
}
