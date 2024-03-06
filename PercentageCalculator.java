import java.util.*;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("marks of english: ");
        int a = sc.nextInt();
        System.out.print("marks of maths: ");
        int  b = sc.nextInt();
        System.out.print("marks of SST: ");
        int c = sc.nextInt();
        System.out.print("marks of Science: ");
        int d = sc.nextInt();
        System.out.print("Marks of Hindi: ");
        int e= sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println(sum);
       double percentage = (sum/5);
        System.out.println(percentage);
    }

}
