package cp;

public class MissingNumber {
    public static void main(String[] args) {
		int arr[] ={2,4,1,8,6,3,7};
		int n= arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        System.out.println(sum);
	}
}

