import java.util.*;
public class DBprime {
    public static void main(String[] args) {
        int n, count=0;
        System.out.print("Entre any number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

//        int i, count = 0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
          if (count==2){
              System.out.println("prime");
          }
          else{
              System.out.println("not prime");
          }
    }
}
