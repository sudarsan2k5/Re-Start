import java.util.Scanner;

public class Four_Factorial {
    public static int Factorial(int n){
        if(n == 1){
            return 1;
        }
        int fnm1 = Factorial(n - 1);

        return n * fnm1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = Factorial(n);
        System.out.println(ans);
    }
}