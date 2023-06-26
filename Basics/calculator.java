import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first no. :");
        int a=sc.nextInt();
        System.out.print("Enter the second no. :");
        int b=sc.nextInt();
        System.out.print("Enter the operator:");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':System.out.println(a+b);
                    break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b);
                    break;
            case '/':System.out.println(a/b);
                    break;
            case '%':System.out.println(a%b);
                    break;
            default:System.out.println("Invalid Operator");        
        }

    }
}
