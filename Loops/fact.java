import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int fact=1;
        System.out.print("Enter you number:");
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial:" + fact);
        sc.close();
    }
    
}
