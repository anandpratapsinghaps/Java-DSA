package functions;

public class binTodec {
    public static void BinToDec(int num){
        int mynum=num;
        int pow=0;
        int decnum=0;
        while(num>0){
            int lastdigit=num%10;
            decnum=decnum + (lastdigit*(int)Math.pow(2, pow));
            pow++;
            num=num/10;
        }
        System.out.println("Decimal of "+ mynum +"="+ decnum);

    }
    public static void main(String[] args) {
        BinToDec(111);
    }
    
}
