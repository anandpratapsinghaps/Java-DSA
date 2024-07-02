package Backtracking;

public class subset {

    public static void subsets(String str, int i, String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("kuch nhi bacha bhai");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
            //yes
            subsets(str, i+1, ans+str.charAt(i));
            //no
            subsets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str, 0, "");
    }
}
