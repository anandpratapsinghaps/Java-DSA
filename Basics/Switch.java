import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the Button no.:");
        Scanner button=new Scanner(System.in);
        int n=button.nextInt();
        switch(n){
            case 1: System.out.println("Num 1");
            break;
            case 2: System.out.println("Num 2");
            break;
            case 3: System.out.println("Num 3");
            break;
            default : System.out.println("I think I'm loosing my mind");
        }
    }
}
