package practiceQues;

public class virusInfaction {
    public static void main(String[] args) {
        String s = "00100100";
        int k = 1;
        int n = s.length();
        StringBuilder sb = new StringBuilder("0".repeat(n));

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                for(int j=Math.min(0,i-k); j<Math.min(n-1,i+k); j++){
                    sb.setCharAt(j, '1');
                }
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(sb.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
