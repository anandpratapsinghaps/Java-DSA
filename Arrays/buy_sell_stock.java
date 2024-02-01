public class buy_sell_stock {
    public static int buysellstock(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buyprice)
                buyprice=arr[i];
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4,9};
        System.out.println(buysellstock(arr));
    }
}

