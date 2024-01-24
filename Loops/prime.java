import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is Prime");
        } else{
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(i%10==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is Prime");
        } else{
            System.out.println("n is not Prime");
        }
        }
        sc.close();
        
    }
}
