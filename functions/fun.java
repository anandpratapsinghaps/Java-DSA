package functions;
import java.util.*;
public class fun{
    public static void printhelloworld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
        // parameter
    public static void calculatesum(){ 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is:"+sum);
        sc.close();
    }
    public static void main(String[] args) {
        //function calling
        // printhelloworld();
        calculatesum();
    }
}
