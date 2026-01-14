import java.util.*;
public class One_Print_Decreasing {
    public static void PrintDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        PrintDecreasing(n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        PrintDecreasing(n);
    }
}
