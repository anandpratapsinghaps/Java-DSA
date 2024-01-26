// import java.util.*;
public class funarr {
    public static void arr(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={20,30,40};
        arr(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("Makrs = "+ marks[i]);
        }
        System.out.println();
    }
}
