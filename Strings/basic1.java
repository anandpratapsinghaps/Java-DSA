package Strings;

public class basic1 {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPlaindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.next();
        // name=sc.nextLine();
        // System.out.println(name);
        String firstname = "Anand";
        String lastname = "Singh";
        String fullname= firstname+" "+lastname;
        // System.out.println(fullname.length());
        // printletter(fullname);
        String str="racecar";
        System.out.println(isPlaindrome(str));
    }
}
