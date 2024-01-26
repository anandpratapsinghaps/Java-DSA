
public class bin_search{
    public static int binarysearch(int arr[],int key){
        int min=0;
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[min]==key){
                return mid;
            }
            if(arr[mid]<key){
                min=mid+1;
            } else{
                max=mid-1;
            }
        }
        
        return -1;
    

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,8,9};
        int key=1;
        System.out.println("key iss index pe mil gya:"+binarysearch(arr, key));
    }
}