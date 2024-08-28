package practiceQues;

public class virusInfaction {
    public static void main(String[] args) {
        String s = "00100100";
        int k = 1;
        int n = s.length();
        boolean[] marked = new boolean[n];

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                for(int j=Math.min(0,i-k); j<Math.min(n-1,i+k); j++){
                    marked[j] = true;
                }
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(marked[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
