public class ResizeArr {
    public int[] resize(int[] arr, int capacity){
        int[] temp=new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }

    public void printArr(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ResizeArr newarr= new ResizeArr();
        int[] original=new int[]{5,1,2,9,10};
        System.out.println("the size of original array : "+ original.length);
        original=newarr.resize(original, 10);
        System.out.println("the size of original array after resize :"+ original.length);
    }
}
