import java.util.Scanner;

public class Three_Print_Increasing_Decreasing {
    public static void Print_Increasing_Decreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Print_Increasing_Decreasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Print_Increasing_Decreasing(n);
    }
    
}
