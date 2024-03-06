import java.util.Scanner;

public class DBfactorial {
    public static int factorialOfn(int n){
        if (n<0) {
            System.out.println("invalid");
        }
        int factorial = 1;
        for (int i = n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return factorial ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorialOfn(n);
    }
}
